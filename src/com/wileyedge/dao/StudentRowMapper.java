package com.wileyedge.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wileyedge.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		int age = rs.getInt("age");
		String name = rs.getString("name");
		String mobile = rs.getString("mobile");
		String address = rs.getString("address");

		Student s = new Student(name,age,mobile,address);
		return s;
	}

}
