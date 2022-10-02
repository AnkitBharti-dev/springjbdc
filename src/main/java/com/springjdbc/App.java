package com.springjdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDaoImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext con = 
        		new ClassPathXmlApplicationContext("config.xml");
        
        StudentDaoImp s = con.getBean("studentImp", StudentDaoImp.class);
        List<Student> students = s.getAllStudent();
        for(Student student:students) {
        	System.out.println(student);
        }
        con.close();
    }
}
