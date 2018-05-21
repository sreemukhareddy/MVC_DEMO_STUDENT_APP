package com.nisum.formexample;

import java.beans.PropertyEditor;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"studentMobile"});
		
		//SimpleDateFormat date=new SimpleDateFormat("yyyy****mm**dd");
		//binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(date,false));
		binder.registerCustomEditor(String.class,"studentName",new StudentNameEditor());
	}
	
	
	@RequestMapping(value="/admissionform",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		System.out.println("coming to admission form..............");
		ModelAndView model=new ModelAndView();
		model.setViewName("AdmissionForm");
		model.addObject("headerMessage", "hello student fill up the form");
		
		return model;
		//return "AdmissionForm";
	}
	
	/*@ModelAttribute
	public void commonObjects(Model model) {
		model.addAttribute("headerMessage", "nisum college of engineering");
	}
	*/
	@RequestMapping(value="/submitadmissionform",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student,BindingResult result) {
			System.out.println("submit form");	
			
			if(result.hasErrors()) {
				ModelAndView model=new ModelAndView();
				model.setViewName("index");
				model.addObject("headerMessage", "hello student fill up the form");
				
				return model;
			}
			
		ModelAndView model=new ModelAndView();
		model.setViewName("AdmissionSuccess");
		model.addObject("headerMessage", "welcome student"+student.getStudentName());
		
		//model.addObject("student1",student);
		return model;
		
	}
	
	
	
	
	
}
