package com.nisum.gontuseries;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/welcome")
	protected ModelAndView helloworld1()
			 {
		
		ModelAndView modelandview=new ModelAndView("display");
		modelandview.addObject("welcomeMessage", "Hi user , welcome to the first spring mvc application ");
		return modelandview;
	}
	
	
	@RequestMapping("/hi")
	protected ModelAndView helloworld2()
			 {
		
		ModelAndView modelandview=new ModelAndView("display");
		modelandview.addObject("welcomeMessage", "Hi user , welcome to the second spring mvc application ");
		return modelandview;
	}
}
