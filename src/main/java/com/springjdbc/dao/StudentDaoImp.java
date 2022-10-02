package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.Student;

public class StudentDaoImp implements StudentDao {

	JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query = "insert into student(rollno, name, city) values(?, ?, ?)";
		return jdbcTemplate.update(query, student.getRollNo(), student.getName(), student.getCity());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) {
		String query = "update student set name = ?, city = ? where rollno = ?";
		return jdbcTemplate.update(query, student.getName(), student.getCity(), student.getRollNo());
	}

	public int delete(int rollNo) {
		String query = "delete from student where rollno = ?";
		return jdbcTemplate.update(query, rollNo);
	}

	public Student getStudent(int rollNo) {
		String query = "select * from student where rollno = ?";
		return this.jdbcTemplate.queryForObject(query, new RowMapperImpl(), rollNo);
	}

	public List<Student> getAllStudent() {
		String query = "select * from student";
		return this.jdbcTemplate.query(query, new RowMapperImpl());
	}
}
