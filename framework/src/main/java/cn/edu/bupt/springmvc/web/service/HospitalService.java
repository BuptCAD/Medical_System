package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.bupt.springmvc.web.model.Hospital;
import cn.edu.bupt.springmvc.web.model.Section;

public interface HospitalService {

	int insert(Hospital record);
	
	List<Hospital> selectByExample();
	
	Hospital selectByPrimaryKey(String hosId);
	
	List<Hospital> selectByPage(int page,int rows);
	
	int updateByPrimaryKeySelective(@Param("record") Hospital record);
	
	int deleteByExample();
	
	public List<Section> getHospitalSectionList(String hospitalId)throws Exception;
}
