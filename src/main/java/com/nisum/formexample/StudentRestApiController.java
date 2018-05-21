package com.nisum.formexample;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestApiController {
	
		@RequestMapping(value="/students",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
		public ArrayList<Student> getStudentList(){
			Student student1=new Student();
			student1.setStudentName("The great Khali");
			
			Student student2=new Student();
			student2.setStudentName("The great Khali");
			
			Student student3=new Student();
			student3.setStudentName("The great Khali");
			
			ArrayList<Student> studentList=new ArrayList<Student>();
			studentList.add(student1);
			studentList.add(student2);
			studentList.add(student3);
			
			return studentList;
		}
		
		
		@RequestMapping(value="/students/{name}",method=RequestMethod.GET)
			public Student getStudent(@PathVariable("name")String name) {
			Student s=new Student();
			s.setStudentName(name);
			return s;
		}
		
		@RequestMapping(value="/students/{name}",method=RequestMethod.PUT)
		public boolean updateStudent(@PathVariable("name")String studentName,@RequestBody Student student) {
			
			System.out.println("StudentName"+studentName);
			System.out.println("studentName:"+student.getStudentName()+"studentHobby"+student.getStudentHobby());
			return true;
			
		}
		
		@RequestMapping(value="/students",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
		public Student addStudent(@RequestBody Student student) {
		System.out.println(student.getStudentName()+""+student.getStudentHobby()+""+student.studentMobile);
		return student;
	}
	
}

