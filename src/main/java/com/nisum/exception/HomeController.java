package com.nisum.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/homepage")
	public String getHomePage() {
		return "home-page";
	}
	
	// if error is there go to the 2nd page else go to the 3rd page
	
	@RequestMapping("/submit")
	public String getSubmittedPage(@RequestParam("id") int id) {
		
		if(id==100) {
		return "submit-page";
		}
		else {
			return "error-page";
		}
	}

}
