package co.greatkorea.www.comm.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

	@RequestMapping(value="/errorView.do", method=RequestMethod.GET)
	public String errorView(HttpServletResponse res, Model model) throws Exception{
		res.setStatus(HttpServletResponse.SC_OK);
		return "/common/error";
	}
}
