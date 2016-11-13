package cn.edu.bupt.springmvc.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.model.Outpatient;
import cn.edu.bupt.springmvc.web.model.Releasenum;
import cn.edu.bupt.springmvc.web.service.OutpatientService;

@Controller
@RequestMapping(value="outpatient")
public class OutpatientController extends GenericController {
	@Resource
	private OutpatientService outpatientService;
	/**
	 * 
	 * 門診信息
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="outpatient_info")
	public void hospitalInfo(HttpServletRequest request, HttpServletResponse response){
		String outpatientId = request.getParameter("outpatientId");
		Outpatient record = outpatientService.selectByPrimaryKey(outpatientId);
		if (record!=null) {
			renderSuccessString(response, record);
		} else {
			renderErrorString(response, "select from Hospital no data!");
		}
	}
	/**
	 * 获得門診所有的医生
	 * 
	 * @param reqest
	 * @param response
	 * @param outpatientId
	 * @return
	 */
	@RequestMapping(value = "outpatient_doctor_list")
	public void hospitalSectionList(HttpServletRequest request, HttpServletResponse response) {

		String outpatientId = request.getParameter("outpatientId");
		
		if (outpatientId != null && !"".equals(outpatientId)) {
			try {
				List<Doctor> doctors = outpatientService.getOutpatientDoctors(outpatientId);
				if (doctors != null) {
					renderSuccessString(response, doctors);
				} else {
					renderErrorString(response, "obtain info error!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				renderErrorString(response, "obtain info error!");
				e.printStackTrace();
			}
		} else {
			renderErrorString(response, "illegalArgument!");
		}

	}
	
	
	/**
	 * 获得門診所有的放號
	 * 
	 * @param reqest
	 * @param response
	 * @param outpatientId
	 * @return
	 */
	@RequestMapping(value = "outpatient_releasenum_list")
	public void hospitalReleasenumList(HttpServletRequest request, HttpServletResponse response) {

		String outpatientId = request.getParameter("outpatientId");
		String week = request.getParameter("week");
		
		if (outpatientId != null && !"".equals(outpatientId)) {
			try {
				List<Releasenum> releasenums = outpatientService.getOutpatientReleasenums(outpatientId,week);
				if (releasenums != null) {
					renderSuccessString(response, releasenums);
				} else {
					renderErrorString(response, "obtain info error!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				renderErrorString(response, "obtain info error!");
				e.printStackTrace();
			}
		} else {
			renderErrorString(response, "illegalArgument!");
		}

	}
	
	
	
	
	@RequestMapping(value="insert")
	public void insert(HttpServletRequest request, HttpServletResponse response){
		Outpatient outpatient = new Outpatient();
		int i = outpatientService.insert(outpatient);
		if (i>0) {
			renderSuccessString(response, outpatient);
		} else {
			renderErrorString(response, "insert outpatient failed!");
		}
	}
	
	@RequestMapping(value="update")
	public void update(HttpServletRequest request, HttpServletResponse response){
		Outpatient outpatient = new Outpatient();
		int i = outpatientService.updateByPrimaryKeySelective(outpatient);
		if (i>0) {
			renderSuccessString(response, "update outpatient success!");
		} else {
			renderErrorString(response, "update outpatient failed!");
		}
	}
	
	@RequestMapping(value="delete")
	public void delete(HttpServletRequest request,HttpServletResponse response){
		int i = outpatientService.deleteByExample();
		if (i>0) {
			renderSuccessString(response, "delete outpatient record success!");
		} else {
			renderErrorString(response, "delete outpatient record failed!");
		}
	}
}


