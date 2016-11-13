package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.bupt.springmvc.web.model.Appointment;

public interface AppointmentService {

	int insert(Appointment record);
	
	List<Appointment> selectByExample();
	
	List<Appointment> selectByPage(int page,int rows);
	
	int updateByPrimaryKeySelective(@Param("record") Appointment record);
	
	int deleteByExample();

	int delete(String appointmentId);
}
