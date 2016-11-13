package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.model.DoctorExample;
import cn.edu.bupt.springmvc.web.model.Releasenum;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    int countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(String doctorid);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(String doctorid);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
	
	List<Doctor> selectDoctorReleaseNumInfoByOutPatientId(String outpatientId);

	List<Releasenum> selectDoctorReleaseNumsBySectionId(String outpatientId);
}