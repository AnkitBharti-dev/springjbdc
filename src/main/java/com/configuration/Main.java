package com.configuration;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.Student;
import com.springjdbc.dao.StudentDao;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = 
				new AnnotationConfigApplicationContext(Test.class);
		StudentDao sd = con.getBean("studentDao", StudentDao.class);
		List<Student> list = sd.getAllStudent();
		for(Student student:list) {
			System.out.println(student);
		}
		con.close();
	}

}
