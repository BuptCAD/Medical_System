package cn.edu.bupt.springmvc.web.dao;

import cn.edu.bupt.springmvc.web.model.Hospital;
import cn.edu.bupt.springmvc.web.model.HospitalExample;
import cn.edu.bupt.springmvc.web.model.Section;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalMapper {
    int countByExample(HospitalExample example);

    int deleteByExample(HospitalExample example);

    int deleteByPrimaryKey(String hosid);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    int updateByExampleSelective(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByExample(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
	
    /**
     * 条件查询
     * @param example是条件
     * @return
     */
    List<Hospital> selectByExample(HospitalExample example);
    /**
     * 根据hosid返回医院信息
     * @param hosid
     * @return
     */
    Hospital selectByPrimaryKey(String hosid);
    /**
     * 根据hosid返回医院的所有科室
     * @param hosid
     * @return
     */
	List<Section> getHospitalSectionResultMap(String hosid);
}