package co.greatkorea.www.visitor.web;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import co.greatkorea.www.CommonPaging;
import co.greatkorea.www.visitor.service.VisitorService;
import co.greatkorea.www.visitor.service.VisitorVO;

@Controller
@RequestMapping("/visitor/*")
public class VisitorController {
	
	@Autowired
	VisitorService service;
	
	@RequestMapping(value="/")
	public String mainView(VisitorVO vo, ModelMap model) throws Exception{
		
//		int rowTot = service.selectTot();
//		CommonPaging paging = new CommonPaging();
//		paging.setTotalCount(rowTot);
		HashMap<String, Integer> page = new HashMap<String, Integer>();
		page.put("start_no", new Integer(0));
		page.put("end_no", new Integer(3));
		
		List<VisitorVO> visitorList = service.selectAll(page);
		System.out.println(visitorList.size());
		model.addAttribute("visitorList", visitorList);
		
		return "/visitor/index";
	}
}	

