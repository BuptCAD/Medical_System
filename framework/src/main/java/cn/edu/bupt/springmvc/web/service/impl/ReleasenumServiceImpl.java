package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.edu.bupt.springmvc.web.dao.ReleasenumMapper;
import cn.edu.bupt.springmvc.web.model.Releasenum;
import cn.edu.bupt.springmvc.web.model.ReleasenumExample;
import cn.edu.bupt.springmvc.web.service.ReleasenumService;

@Service
public class ReleasenumServiceImpl implements ReleasenumService {

	@Resource
	private ReleasenumMapper releasenumMapper;
	
	private ReleasenumExample releasenumExample;
	
	@Override
	public int insert(Releasenum record) {
		String id = UUID.randomUUID().toString();
		record.setReleaseid(id);
		record.setDoctorid("651dcb6c-76c8-4dde-9ae8-2a0b99885535"); //医生主键
		record.setPrice(10.0);
		record.setDate(null);
		record.setRemark("备注信息:杨红专家医生");
		record.setIssuccess(null);
		record.setIsfamilynum(null);
		int i = releasenumMapper.insert(record);
		return i;
	}

	@Override
	public List<Releasenum> selectByExample() {
		releasenumExample = new ReleasenumExample();
		releasenumExample.createCriteria().andDoctoridEqualTo(null);
		List<Releasenum> list = releasenumMapper.selectByExample(releasenumExample);
 		return list;
	}

	@Override
	public List<Releasenum> selectByPage(int page, int rows) {
		releasenumExample = new ReleasenumExample();
		PageHelper.startPage(page, rows);
		List<Releasenum> list = releasenumMapper.selectByExample(releasenumExample);
		return list;
	}

	@Override
	public int updateByPrimaryKeySelective(Releasenum record) {
		record.setReleaseid("");
		record.setDoctorid("");
		record.setDate(null);
		record.setRemark("备注信息");
		record.setIssuccess(null);
		record.setIsfamilynum(null);
		int i = releasenumMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int deleteByExample() {
		releasenumExample = new ReleasenumExample();
		releasenumExample.createCriteria().andRealseidEqualTo("");
		int i = releasenumMapper.deleteByExample(releasenumExample);
		return i;
	}

	@Override
	public Releasenum getReleasenumDetailsById(String releasenumId) throws Exception {
		// TODO Auto-generated method stub
		releasenumExample = new ReleasenumExample();
		releasenumExample.createCriteria().andRealseidEqualTo(releasenumId);
		return releasenumMapper.selectByExample(releasenumExample).get(0);
	}

	@Override
	public Releasenum getReleasenumDetailInfo(String releasenumId) {
		// TODO Auto-generated method stub
		return releasenumMapper.selectByPrimaryKey(releasenumId);
	}

}
