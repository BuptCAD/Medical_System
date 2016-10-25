package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import cn.edu.bupt.springmvc.web.model.Section;

public interface SectionService {

	int insert(Section record);
	
	List<Section> selectByExample();
	
	List<Section> selectByPage(int page,int rows);
	
	int updateByPrimaryKeySelective(@Param("record") Section record);
		
	int deleteByExample();
}
