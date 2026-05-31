package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student s = (Student) context.getBean(Student.class);
		s.display();
		
		Employee e = context.getBean(Employee.class);
		e.info();

	}

}
