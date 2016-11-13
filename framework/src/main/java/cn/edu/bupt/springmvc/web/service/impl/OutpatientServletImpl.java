package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.edu.bupt.springmvc.web.dao.OutpatientMapper;
import cn.edu.bupt.springmvc.web.dao.SectionMapper;
import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.model.Outpatient;
import cn.edu.bupt.springmvc.web.model.OutpatientExample;
import cn.edu.bupt.springmvc.web.model.Releasenum;
import cn.edu.bupt.springmvc.web.model.ReleasenumExample;
import cn.edu.bupt.springmvc.web.model.Section;
import cn.edu.bupt.springmvc.web.service.OutpatientService;

@Service
public class OutpatientServletImpl implements OutpatientService {

	@Resource
	private OutpatientMapper outpatientMapper;
	@Resource
	private SectionMapper sectionMapper;
	
	private OutpatientExample outpatientExample;
	
	
	@Override
	public Outpatient selectByName(String outpatientName) {
		outpatientExample = new OutpatientExample();
		outpatientExample.createCriteria().andOutpatientnameEqualTo(outpatientName);
		List<Outpatient> list = outpatientMapper.selectByExample(outpatientExample);
		Outpatient record = list.get(0);
		return record;
	}
	
	@Override
	public int insert(Outpatient record) {
		String id = UUID.randomUUID().toString();
		record.setOutpatientid(id);
		Section section = sectionMapper.selectBySectionName("呼吸内科");
		record.setSectionid(section.getSectionid());
		record.setOutpatientname("呼吸内科普通门诊");
		record.setSectionname(section.getSectionname());
		record.setOutpatientloc("门诊部呼吸内科普通门诊三层");
		record.setCount(100);
		record.setTelephone("010-2244567");
		int i = outpatientMapper.insert(record);
		return i;
	}

	@Override
	public List<Outpatient> selectByExample() {
		outpatientExample = new OutpatientExample();
		outpatientExample.createCriteria().andSectionnameEqualTo("");
		List<Outpatient> list = outpatientMapper.selectByExample(outpatientExample);
		return list;
	}

	
	/**
	 * @author qjk
	 * @param sectionName
	 * 
	 * 根据科室名称进行门诊表的查询
	 */
	@Override
	public List<Outpatient> selectBySectionName(String sectionName) {
		outpatientExample = new OutpatientExample();
		outpatientExample.createCriteria().andSectionnameEqualTo(sectionName);
		List<Outpatient> list = outpatientMapper.selectByExample(outpatientExample);
		return list;
	}

	@Override
	public List<Outpatient> selectByPage(int page, int rows) {
		outpatientExample = new OutpatientExample();
		PageHelper.startPage(page, rows);
		List<Outpatient> list = outpatientMapper.selectByExample(outpatientExample);
		return list;
	}

	@Override
	public int updateByPrimaryKeySelective(Outpatient record) {
		record.setOutpatientid("");
		record.setSectionid("");
		record.setOutpatientname("");
		record.setSectionname("");
		record.setOutpatientloc("");
		record.setCount(100);
		record.setTelephone("010-2344565");
		int i = outpatientMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int deleteByExample() {
		outpatientExample = new OutpatientExample();
		outpatientExample.createCriteria().andOutpatientnameIsNotNull();
		int i = outpatientMapper.deleteByExample(outpatientExample);
		return i;
	}
	
	@Override
	public Outpatient getOutpatientDetailsById(String outpatientId) throws Exception {
		// TODO Auto-generated method stub
		return outpatientMapper.selectByPrimaryKey(outpatientId);
	}

	@Override
	public List<Outpatient> getOutpatientBySectionId(String sectionId) {
		// TODO Auto-generated method stub
		outpatientExample = new OutpatientExample();
		outpatientExample.createCriteria().andSectionidEqualTo(sectionId);
		List<Outpatient> customerList = outpatientMapper.selectByExample(outpatientExample);	
		return customerList;
	}

	@Override
	public Outpatient selectByPrimaryKey(String outpatientId) {
		// TODO Auto-generated method stub
		Outpatient outpatient = outpatientMapper.selectByPrimaryKey(outpatientId);	
		return outpatient;
	}

	@Override
	public List<Doctor> getOutpatientDoctors(String outpatientId) {
		// TODO Auto-generated method stub
		List<Doctor> doctors = outpatientMapper.selectOutpatientDoctors(outpatientId);	
		return doctors;
	}

	
	@Override
	public List<Releasenum> getOutpatientReleasenums(String outpatientId,String week) {
		// TODO Auto-generated method stub
		ReleasenumExample example = new ReleasenumExample();
		example.setOutpatientId(outpatientId);
		if(week!=null){
			example.createCriteria().andWeekEqualTo(week);
		}else{
			example.createCriteria().andWeekIsNotNull();
		}
		return outpatientMapper.selectReleasenums(example);
	}

}
