package com.model.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/model/dao/spring.xml");
		StudentDaoImpl s1 = (StudentDaoImpl) context.getBean("studentdao");
		
		//inserting record
		s1.save(new Student("Ram","ram@gmail.com"));
		
		//delete record
				s1.delete(7);
				
	    //display data
	      List<Student> student=s1.findAll();
		     for(Student s:student) {
			  System.out.println(s.getId()+" "+s.getName()+" "+s.getEmail());
		   }
		     
		//update
		Student s = new Student();
		s.setId(1);
		s.setName("JayeshNagya");
		s.setEmail("jayeshnagya2gmail.com");
		
		s1.update(s);

	}

}
