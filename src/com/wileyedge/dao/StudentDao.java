package com.wileyedge.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.wileyedge.model.Student;

@Component(value = "dao")
public class StudentDao implements IDao {

	@Autowired
	private JdbcTemplate template;// these are set up in beans file

	@Override
	public void persistStudent(Student s) {

		String sql = "insert into student values(?,?,?,?);";

		template.update(sql, s.getName(), s.getAge(), s.getMobile(),s.getAddress());

	}

	@Override
	public Student retrieveStudent(String searchName) {

		String sql = "select * from student where name = ?";

		return template.queryForObject(sql, new Object[]{searchName} ,new StudentRowMapper());

	}

}
