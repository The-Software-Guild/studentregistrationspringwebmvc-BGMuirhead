package com.wileyedge.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wileyedge.model.Student;
import com.wileyedge.service.IService;

@Controller
public class StudentRegistrationController {
	
	@Autowired
	private IService service;
	
	
	// Dispatcher servlet should send here for index.htm
	// it will redirect to the index.jsp webpage
	@RequestMapping(value = "/index.htm" , method = RequestMethod.GET)
	public String showIndexPage(Map<String,Student> map)
	{
		System.out.println("Inside showIndexPage of StudentRegistrationController");
		map.put("s", new Student()); // set up a student object for the data to be mapped to
		return "index";
		
	}
	
	//if we post to this page then we can save the student to db 
	// then return to a file in pages/success.jsp
	@RequestMapping(value = "/index.htm", method = RequestMethod.POST)
	public String persistStudent(@ModelAttribute("s") Student s, Map<String,Student> map)
	{
		System.out.println("Inside persistStudent of StudentRegistrationController");
		System.out.println(s); // print the student
		map.put("s",s); // put the student in the map;
		
		
		//we can only save one employee at a time so call dao layer through service 
		service.saveStudent(s);
		
		return "success"; // will redirect to service page
		
		
	}

}
