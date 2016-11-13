package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.edu.bupt.springmvc.web.dao.HospitalMapper;
import cn.edu.bupt.springmvc.web.model.Hospital;
import cn.edu.bupt.springmvc.web.model.HospitalExample;
import cn.edu.bupt.springmvc.web.model.Section;
import cn.edu.bupt.springmvc.web.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Resource
	private HospitalMapper hospitalMapper;
	
	private HospitalExample hospitalExample;
	
	@Override
	public int insert(Hospital record) {
		String id =UUID.randomUUID().toString();
		record.setHosid(id);
		record.setHosname("北京海淀区社区医院");
		record.setHosgrade("三甲医院");
		record.setHosaddr("北京海淀区西土城路XX号");
		record.setHostel("010-4354555");
		record.setHosintro("北京海淀区社区医院简介：北京市海淀区社区医院成立于1990年。");
		record.setHosurl("www.bjhdsqhospital.com");
		record.setDean("康德俊凯");
		record.setDeanintro("北京海淀区社区医院-院长简介");
		record.setHostraffic("交通情况101,102,103,104,105");
		record.setHosspecial("特色科室有儿科，外科，等等.");
		record.setHosestablished(null);
		int i = hospitalMapper.insert(record);
		return i;
	}

	@Override
	public List<Hospital> selectByExample() {
		hospitalExample = new HospitalExample();
		hospitalExample.createCriteria().andDeanEqualTo("王俊");
		List<Hospital> list = hospitalMapper.selectByExample(hospitalExample);
		return list;
	}

	@Override
	public Hospital selectByPrimaryKey(String hosId) {
		Hospital record = hospitalMapper.selectByPrimaryKey(hosId);
		return record;
	}

	@Override
	public List<Hospital> selectByPage(int page, int rows) {
		hospitalExample = new HospitalExample();
		PageHelper.startPage(page, rows);
		List<Hospital> list = hospitalMapper.selectByExample(hospitalExample);
		return list;
	}

	@Override
	public int updateByPrimaryKeySelective(Hospital record) {
		record.setHosid("1a70694a-b425-42e3-8e09-451d66237363");
		record.setHosname("北京协和医院");
		record.setHosgrade("三甲医院");
		record.setHosaddr("东城区东单帅府园1号(东院)");
		record.setHostel("010-43545556");
		record.setHosintro("北京协和医院的简介");
		record.setHosurl("www.xiehe.com");
		record.setDean("王俊");
		record.setDeanintro("北京协和医院院长简介");
		record.setHostraffic("交通情况101,102,103,104,105");
		record.setHosspecial("***特色科室有儿科，外科，等等.");
		int i = hospitalMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int deleteByExample() {
		hospitalExample = new HospitalExample();
		hospitalExample.createCriteria().andDeanEqualTo("王为"); //院长姓名
		int i = hospitalMapper.deleteByExample(hospitalExample);
		return i;
	}
	
		@Override
	public List<Section> getHospitalSectionList(String hospitalId) throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.getHospitalSectionResultMap(hospitalId);
	}


}
