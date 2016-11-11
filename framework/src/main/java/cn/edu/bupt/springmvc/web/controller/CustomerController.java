package cn.edu.bupt.springmvc.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Customer;
import cn.edu.bupt.springmvc.web.service.CustomerService;

@Controller
@RequestMapping(value="customer")
public class CustomerController extends GenericController {
	/**
	 * 
	 * @author qjk
	 * @param request
	 * @param response
	 * 
	 * 注册函数，前端页面的注册
	 */
	@RequestMapping(value="register",method=RequestMethod.POST)
	public void register(HttpServletRequest request, HttpServletResponse response){
		String customerName = request.getParameter("account");
		String idCard = request.getParameter("idCard");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		Customer record = new Customer();
		if(customerName!=null){
			record.setCustomername(customerName);
		}
		if(idCard!=null){
			record.setIdcard(idCard);
		}
		if(phone!=null){
			record.setPhone(phone);
		}
		if(password!=null){
			record.setPassword(password);
		}
		int i = customerService.insert(record);
		if (i>0) {
			renderSuccessString(response, record);
		} else {
			renderErrorString(response, "insert table customer failed!");
		}
	}
	
	
	/**
	 * 用户登录验证
	 * @author lhh
	 */
	@RequestMapping(value="login", method=RequestMethod.POST)
	public void login(HttpServletRequest request, HttpServletResponse response){
		String userName = request.getParameter("account");
		String idCard = request.getParameter("idCard");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		//System.out.println(userName);
		Customer custoemr = new Customer();
		custoemr.setCustomername(userName);
		custoemr.setIdcard(idCard);
		custoemr.setPhone(phone);
		custoemr.setPassword(password);
		
		try {
			if (customerService.login(custoemr)) {
				renderSuccessString(response, custoemr);
			} else {
				renderErrorString(response, "can't obtain customer infor");
			}
		} catch (Exception e) {
			renderErrorString(response, "can't obtain customer infor");
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@Resource
	private CustomerService customerService;
	
	/**
	 * @author qjk
	 * @param request
	 * @param response
	 * 
	 * 插入一条数据
	 */
	@RequestMapping(value="insert")
	public void insert(HttpServletRequest request, HttpServletResponse response){
		Customer record = new Customer();
		int i = customerService.insert(record);
		if (i>0) {
			renderSuccessString(response, record);
		} else {
			renderErrorString(response, "insert table customer failed!");
		}
	}
	
	
	
	/**
	 * @author qjk
	 * @param request
	 * @param response
	 * 
	 * 查询所有的客户
	 */
	@RequestMapping(value="selectByExample")
	public void select(HttpServletRequest request, HttpServletResponse response){
		List<Customer> list = customerService.selectByExample();
		if(list!=null){
			renderSuccessString(response, list);
		} else {
			renderErrorString(response, "select customer no data");
		}
		
	}
	
	/**
	 * @author qjk
	 * @param request
	 * @param response
	 * 
	 * 根据主键进行记录更新
	 */
	@RequestMapping(value="update")
	public void update(HttpServletRequest request, HttpServletResponse response){
		Customer record = new Customer();
		int i = customerService.updateByPrimaryKeySelective(record);
		if (i>0) {
			renderSuccessString(response, "update customer success!");
		} else {
			renderErrorString(response, "update customer failed!");
		}
	}
	
	/**
	 * @author qjk
	 * @param request
	 * @param response
	 * 
	 * 删除一条记录
	 */
	@RequestMapping(value="delete")
	public void delete(HttpServletRequest request,HttpServletResponse response){
		int i = customerService.deleteByExample();
		if (i>0) {
			renderSuccessString(response, "delete customer record success!");
		} else {
			renderErrorString(response, "delete customer record failed!");
		}
	}
	
}

