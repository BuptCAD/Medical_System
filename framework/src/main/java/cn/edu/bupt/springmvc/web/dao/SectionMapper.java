package cn.edu.bupt.springmvc.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.bupt.springmvc.web.model.Outpatient;
import cn.edu.bupt.springmvc.web.model.Section;
import cn.edu.bupt.springmvc.web.model.SectionExample;

public interface SectionMapper {
    int countByExample(SectionExample example);

    int deleteByExample(SectionExample example);

    int deleteByPrimaryKey(String sectionid);

    int insert(Section record);

    int insertSelective(Section record);


    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByExample(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);
	
    List<Section> selectByExample(SectionExample example);

    Section selectByPrimaryKey(String sectionid);
    /**
     * 获得科室下的所有门诊
     * @param sectionId
     * @return
     */
	List<Outpatient> selectSectionOutpatientsBySectionId(String sectionId);
	
    /*qjk add interface*/
	Section selectBySectionName(String sectionName);
}