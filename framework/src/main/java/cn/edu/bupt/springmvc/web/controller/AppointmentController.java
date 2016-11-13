package cn.edu.bupt.springmvc.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Appointment;
import cn.edu.bupt.springmvc.web.service.AppointmentService;

@Controller
@RequestMapping(value="appointment")
public class AppointmentController extends GenericController {

	@Resource
	private AppointmentService appointmentService;
	
	
	/**
	 * 創建預約
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="create_appointment")
	public void createAppointment(HttpServletRequest request, HttpServletResponse response){
		String appointmentStr = request.getParameter("appointment");
		Appointment appointment = null;
		if(appointmentStr!=null){
			Gson gson = new Gson();
			appointment = gson.fromJson(appointmentStr, Appointment.class);
		}
		
		int i = 0;
		if(appointment!=null){
			 i = appointmentService.insert(appointment);
		}
		if (i>0) {
			renderSuccessString(response, appointment);
		} else {
			renderErrorString(response, "insert appointment failed!");
		}
	}
	
	
	
	@RequestMapping(value="insert")
	public void insert(HttpServletRequest request, HttpServletResponse response){
		Appointment record = new Appointment();
		int i = appointmentService.insert(record);
		if (i>0) {
			renderSuccessString(response, record);
		} else {
			renderErrorString(response, "insert appointment failed!");
		}
	}
	
	@RequestMapping(value="selectByExample")
	public void select(HttpServletRequest request, HttpServletResponse response){
		List<Appointment> list = appointmentService.selectByExample();
		if(list!=null){
			renderSuccessString(response, list);
		} else {
			renderErrorString(response, "select appointment no data");
		}
		
	}
	
	@RequestMapping(value="update")
	public void update(HttpServletRequest request, HttpServletResponse response){
		Appointment record = new Appointment();
		int i = appointmentService.updateByPrimaryKeySelective(record);
		if (i>0) {
			renderSuccessString(response, "update appointment success!");
		} else {
			renderErrorString(response, "update appointment failed!");
		}
	}
	
	/**
	 * 刪除預約
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="delete")
	public void delete(HttpServletRequest request,HttpServletResponse response){
		String appointmentId = request.getParameter("appointmentId");
		int i = appointmentService.delete(appointmentId );
		if (i>0) {
			renderSuccessString(response, "delete appointment record success!");
		} else {
			renderErrorString(response, "delete appointment record failed!");
		}
	}
}

