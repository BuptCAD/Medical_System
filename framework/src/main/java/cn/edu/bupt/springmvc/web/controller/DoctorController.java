package cn.edu.bupt.springmvc.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.model.Releasenum;
import cn.edu.bupt.springmvc.web.service.DoctorService;

@Controller
@RequestMapping(value="doctor")
public class DoctorController extends GenericController {
	
	@Resource
	private DoctorService doctorService;
	
	
	/**
	 * 
	 * 医生信息
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="doctor_info")
	public void hospitalInfo(HttpServletRequest request, HttpServletResponse response){
		String doctorId = request.getParameter("doctorId");
		Doctor record = null;
		try {
			record = doctorService.getDoctorDetailInfo(doctorId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (record!=null) {
			renderSuccessString(response, record);
		} else {
			renderErrorString(response, "select from doctor no data!");
		}
	}
	/**
	 * 医生所有房号
	 * 
	 * @param reqest
	 * @param response
	 * @param hospitalId
	 * @return
	 */
	@RequestMapping(value = "doctor_releasenum_list")
	public void hospitalSectionList(HttpServletRequest request, HttpServletResponse response) {

		String doctorId = request.getParameter("doctorId");
		
		if (doctorId != null && !"".equals(doctorId)) {
			try {
				List<Releasenum> doctors = doctorService.getDoctorReleaseNum(doctorId);
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
	
	


	
	
	@RequestMapping(value="insert")
	public void insert(HttpServletRequest request, HttpServletResponse response, Doctor doctor){
		int i = doctorService.insert(doctor);
		if (i>0) {
			renderSuccessString(response, doctor);
		} else {
			renderErrorString(response, "insert doctor failed!");
		}
	}
	@RequestMapping(value="update")
	public void update(HttpServletRequest request, HttpServletResponse response){
		Doctor doctor = new Doctor();
		int i = doctorService.updateByPrimaryKeySelective(doctor);
		if (i>0) {
			renderSuccessString(response, "update doctor success!");
		} else {
			renderErrorString(response, "update doctor failed!");
		}
	}
	
	@RequestMapping(value="delete")
	public void delete(HttpServletRequest request,HttpServletResponse response){
		int i = doctorService.deleteByExample();
		if (i>0) {
			renderSuccessString(response, "delete doctor record success!");
		} else {
			renderErrorString(response, "delete doctor record failed!");
		}
	}
}
