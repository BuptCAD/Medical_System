package cn.edu.bupt.springmvc.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Outpatient;
import cn.edu.bupt.springmvc.web.model.Section;
import cn.edu.bupt.springmvc.web.service.SectionService;

/**
 * 科室
 * @author wydewy
 *
 */

@Controller
@RequestMapping(value="section")
public class SectionController extends GenericController {

	@Resource
	private SectionService sectionService;
	
	/**
	 * 
	 * 根据医院sectionId获得医院的信息
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="section_info")
	public void hospitalInfo(HttpServletRequest request, HttpServletResponse response){
		String sectionId = request.getParameter("sectionId");
		Section record = sectionService.selectByPrimaryKey(sectionId);
		if (record!=null) {
			renderSuccessString(response, record);
		} else {
			renderErrorString(response, "select from Hospital no data!");
		}
	}
	/**
	 * 根据sectionid获得科室下的所有所有门诊的信息
	 * 
	 * @param reqest
	 * @param response
	 * @param hospitalId
	 * @return
	 */
	@RequestMapping(value = "section_outpatient_list")
	public void hospitalSectionList(HttpServletRequest request, HttpServletResponse response) {

		String sectionId = request.getParameter("sectionId");
		
		if (sectionId != null && !"".equals(sectionId)) {
			try {
				List<Outpatient> sections = sectionService.getSectionOutpatient(sectionId);
				if (sections != null) {
					renderSuccessString(response, sections);
				} else {
					renderErrorString(response, "obtain info error!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				renderErrorString(response, "obtain info error!");
				e.printStackTrace();
			}
		} else {
			renderErrorString(response, "illegalArgument!");
		}

	}
	
	
	
	
	
	
	/**
	 * @author qjk
	 * 插入科室表，给定医院id,进行在该医院下新建一条科室记录
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="insert")
	public void insert(HttpServletRequest request, HttpServletResponse response){
		//String hostId = request.getParameter("hostId");
		//该记录已经在数据库中，为新建数据方便
		//String hostId = "921ca47b-fee2-419e-8ac9-9ae7f1435d26";
		Section section = new Section();
		//section.setHosid(hostId);
		int i = sectionService.insert(section);
		if (i>0) {
			renderSuccessString(response, section);
		} else {
			renderErrorString(response, "insert section failed!");
		}
	}
	
	
	/**
	 * 根据科室id获取科室详细的信息
	 * @author qjk
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="searchSectionInfo",method=RequestMethod.POST)
	public void searchSectionInfo(HttpServletRequest request, HttpServletResponse response){
		String sectionId = request.getParameter("data");
		Section record = sectionService.searchSectionInfo(sectionId);
		if (record!=null) {
			renderSuccessString(response, record);
		} else {
			renderErrorString(response, "select section info error!");
		}
	}
	
	@RequestMapping(value="update")
	public void update(HttpServletRequest request, HttpServletResponse response){
		Section section = new Section();
		int i = sectionService.updateByPrimaryKeySelective(section);
		if (i>0) {
			renderSuccessString(response, "update section success!");
		} else {
			renderErrorString(response, "update section failed!");
		}
	}
	
	@RequestMapping(value="delete")
	public void delete(HttpServletRequest request,HttpServletResponse response){
		int i = sectionService.deleteByExample();
		if (i>0) {
			renderSuccessString(response, "delete section record success!");
		} else {
			renderErrorString(response, "delete section record failed!");
		}
	}
}

