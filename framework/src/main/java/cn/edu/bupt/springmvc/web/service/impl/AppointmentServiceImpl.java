package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.edu.bupt.springmvc.web.dao.AppointmentMapper;
import cn.edu.bupt.springmvc.web.model.Appointment;
import cn.edu.bupt.springmvc.web.model.AppointmentExample;
import cn.edu.bupt.springmvc.web.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Resource
	private AppointmentMapper appointmentMapper;
	
	private AppointmentExample appointmentExample;
	
	@Override
	public int insert(Appointment record) {
		String id = UUID.randomUUID().toString();
		record.setId(id);
		record.setDoctorid(null);
		record.setCustomerid(null);
		record.setRealseid(null);
		record.setIdcard(null);
		record.setType((byte)1);
		record.setSectionname("");
		record.setAppointdate(null);
		record.setCost(100.0);
		record.setDoctorname("");
		record.setTelephone("010-23445456");
		record.setSectionarea(null);
		int i = appointmentMapper.insert(record);
		return i;
	}

	@Override
	public List<Appointment> selectByExample() {
		appointmentExample = new AppointmentExample();
//		appointmentExample.createCriteria().andDoctornameEqualTo("");
		List<Appointment> list = appointmentMapper.selectByExample(appointmentExample);
		return list;
	}

	@Override
	public List<Appointment> selectByPage(int page, int rows) {
		appointmentExample = new AppointmentExample();
		PageHelper.startPage(page, rows);
		List<Appointment> list = appointmentMapper.selectByExample(appointmentExample);
		return list;
	}

	@Override
	public int updateByPrimaryKeySelective(Appointment record) {
		record.setId("");
		record.setDoctorid(null);
		record.setCustomerid(null);
		record.setRealseid(null);
		record.setIdcard(null);
		record.setType((byte)1);
		record.setSectionname("");
		record.setAppointdate(null);
		record.setCost(100.0);
		record.setDoctorname("");
		record.setTelephone("010-23445456");
		record.setSectionarea(null);
		int i = appointmentMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int deleteByExample() {
		appointmentExample = new AppointmentExample();
		appointmentExample.createCriteria().andIdcardEqualTo("");
		int i = appointmentMapper.deleteByExample(appointmentExample);
		return i;
	}

	@Override
	public int delete(String appointmentId) {
		// TODO Auto-generated method stub
		return appointmentMapper.deleteByPrimaryKey(appointmentId);
	}

}
