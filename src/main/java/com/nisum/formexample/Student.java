package com.nisum.formexample;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonPropertyOrder({"Student_Name","studentHobby","studentMobile","studentSkills","studentAddress"})
public class Student {
	
	@JsonProperty("Student_Name")
	@Pattern(regexp="[^0-9]*")
	String studentName;
	
	
	@Size(min=2,max=12,message="Please enter a value for studentHobby between {min} and {max}")
	String studentHobby;
	
	@Max(9999999)
	Long studentMobile;
	
	//@Past
	//Date studentDOB;
	
	ArrayList<String> studentSkills;
	
	Address studentAddress;
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	/*public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}*/
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	

}
