package com.wileyedge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wileyedge.dao.IDao;
import com.wileyedge.model.Student;


@Component(value = "service")
public class StudentService implements IService{

	@Autowired
	private IDao dao;
//	
//    public StudentService(ServletContext ctx) {
//    	String driverName = ctx.getInitParameter("dbDriver");
//    	String dbPath = ctx.getInitParameter("dbPath");;
//    	String dbUsername =ctx.getInitParameter("dbUsername");;
//    	String dbPassword = ctx.getInitParameter("dbPassword");;
//    	
//    	dao= new StudentDao(driverName, dbPath, dbUsername, dbPassword);
//	}
	
	@Override
	public void saveStudent(Student s) {
		dao.persistStudent(s);

	}

	@Override
	public Student getStudent(String name) {
		return dao.retrieveStudent(name);
	}


}
