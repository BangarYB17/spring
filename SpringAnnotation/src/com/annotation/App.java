package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Instructor i1 =(Instructor) context.getBean("inst");
		System.out.println(i1);
		
	}
	
}
