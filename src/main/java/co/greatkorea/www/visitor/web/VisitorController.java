package co.greatkorea.www.visitor.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import co.greatkorea.www.CommonPaging;
import co.greatkorea.www.visitor.service.VisitorService;

@Controller
@RequestMapping("/visitor/*")
public class VisitorController {
	
	@Autowired
	VisitorService service;
	
	@RequestMapping(value="/")
	public String mainView(ModelMap model) throws Exception{
		
		int rowTot = service.selectTot();
		CommonPaging paging = new CommonPaging();
		paging.setTotalCount(rowTot);
//		HashMap<String, int> page = new HashMap<String, int>();
//		page.put("start_no", paging.get)
		
		return "/visitor/index";
	}

}


