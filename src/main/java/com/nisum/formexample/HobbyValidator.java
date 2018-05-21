package com.nisum.formexample;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	public void initialize(IsValidHobby isValidHobby) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(String studentHobby, ConstraintValidatorContext context) {
		
		if(studentHobby==null) {
			return false;
		}
		if(studentHobby.matches("Music | Cricket | Hockey | Kabaddi")) {
			return true;
		}
		else {
			return false;
		}
	}

}
