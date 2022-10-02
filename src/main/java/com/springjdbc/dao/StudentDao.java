package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.Student;

public interface StudentDao {
	public abstract int insert(Student student);
	public abstract int update(Student student);
	public abstract int delete(int rollNo);
	public abstract Student getStudent(int rollNo);
	public abstract List<Student> getAllStudent();
}
