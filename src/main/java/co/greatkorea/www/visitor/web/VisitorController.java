package co.greatkorea.www.visitor.web;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.greatkorea.www.comm.CommonPaging;
import co.greatkorea.www.comm.ParamValidatChk;
import co.greatkorea.www.visitor.service.VisitorService;
import co.greatkorea.www.visitor.service.VisitorVO;

@Controller
@RequestMapping("/visitor/*")
public class VisitorController extends ParamValidatChk {
	
	@Autowired
	VisitorService service;
	
	@RequestMapping(value="/index.do")
	public String mainView(
			  @RequestParam(value="page", required=false, defaultValue = "1") String page
			, @RequestParam(value="searchStr", required=false) String searchStr
			, VisitorVO vo
			, ModelMap model) throws Exception{
		//page ��ȿ�� üũ
		int pageNo;
		page = getParam(page);
		if (!(isEmpty(page) && isNumeric(page))) {
			pageNo = toInteger(page);
			if (pageNo < 1)	pageNo = 1;
		} else {
			pageNo = 1;
		}
		//searchStr ��ȿ�� üũ
		searchStr = getParam(searchStr);
		if (!isEmpty(searchStr)) searchStr = setLength(searchStr, 20);
		
		int rowTot = service.selectTot(searchStr);
		CommonPaging paging = new CommonPaging();
		paging.setPageNo(pageNo);
		paging.setPageSize(5);
		paging.setTotalCount(rowTot);
		
		HashMap<String, Object> limit = new HashMap<String, Object>();
		limit.put("start_no", new Integer(paging.getStartNo()));
		limit.put("end_no", new Integer(paging.getEndNo()));
		limit.put("searchStr", searchStr);
		
		List<VisitorVO> visitorList = service.selectAll(limit);
		model.addAttribute("visitorList", visitorList);
		model.addAttribute("paging", paging);
		model.addAttribute("searchStr", searchStr);
		
		return "/visitor/index";
	}
	
	@RequestMapping(value="/save.do")
	public String visitorSave(@RequestParam(value="contents", required=true) String contents, ModelMap model) throws SQLException{
		//contents ��ȿ���˻�
		contents = getParam(contents);
		if (isEmpty(contents)){
			//���� ǥ���ϱ�
			return "/visitor/index";
		}
		
		String colors[] = {"yellow", "orange", "pink", "blue", "green"};
		Random ran = new Random();
		int r_num = ran.nextInt(5);
		
		VisitorVO visitor = new VisitorVO();
		visitor.setContents(contents);
		visitor.setColor(colors[r_num]);
		visitor.setInput_ip("111.111.111.111");
		visitor.setMember_no(1);
		visitor.setWrite_id("rai007");
		
		int row = service.insert(visitor);
		//����
		
		return "/visitor/index";
	}
}	

