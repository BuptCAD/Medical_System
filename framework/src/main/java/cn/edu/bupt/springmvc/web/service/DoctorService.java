package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.model.Releasenum;

public interface DoctorService {
	
	int insert(Doctor record);
	
	List<Doctor> selectByExample();
	
	/**
	 * @author qjk
	 * @param page
	 * @param rows
	 * @return
	 */
	List<Doctor> selectBySection(String sectionName);
	
	List<Doctor> selectByOutpatientId(String outpatientId);
 	
	Doctor searchDoctorInfo(String doctorId);
	
	List<Doctor> selectByPage(int page,int rows);
	
	int updateByPrimaryKeySelective(@Param("record") Doctor record);
	
	int deleteByExample();
	
	public Doctor getDoctorDetailInfo(String doctorId) throws Exception;
	
	public List<Releasenum> getDoctorReleaseNum(String outpatientId) throws Exception;
}
