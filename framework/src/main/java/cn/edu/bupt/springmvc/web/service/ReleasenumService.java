package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.bupt.springmvc.web.model.Releasenum;

public interface ReleasenumService {

	int insert(Releasenum record);
	
	List<Releasenum> selectByExample();
	
	List<Releasenum> selectByPage(int page,int rows);
	
	int updateByPrimaryKeySelective(@Param("record") Releasenum record);
	
	int deleteByExample();
	
	Releasenum getReleasenumDetailsById(String releasenumId) throws Exception;

	Releasenum getReleasenumDetailInfo(String releasenumId);
}
