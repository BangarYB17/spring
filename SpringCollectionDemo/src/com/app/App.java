package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Question;

public class App {

	public static void main(String[] args) {
		// constructor injection
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Question q = (Question)context.getBean("ques");
		q.display();
	}

}
