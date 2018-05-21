package com.nisum.formexample;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfToday extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception {
		
		Calendar cal=Calendar.getInstance();
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); // getting the day on which the request is made
		
		if(dayOfWeek==1) {//1=sun,2=mon,4=wed,3=tue,5=thur,6=fri,7=sat
			response.getWriter().write("The website is on shut on sundays"+
		"please visit on otherdays");
			
			return false;
		}
		return true;
	}

}
