package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.services.AddService;

@Controller

public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i1,@RequestParam("t2") int i2) {
		
		
		
		AddService addSer=new AddService();
		int i3=addSer.add(i1,i2);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("display.jsp");
		modelAndView.addObject("welcomeMessage",i3);
		
		return modelAndView;
	}
}
