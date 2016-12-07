package co.greatkorea.www.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class IndexController {

	@RequestMapping(value="/index.do")
	public String mainView(){
		return "/index";
	}

}
