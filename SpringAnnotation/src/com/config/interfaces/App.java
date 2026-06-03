package com.config.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.AppConfig;
@ComponentScan("com.config.interfaces")
public class App {

	public static void main(String[] args) {
//		ApplicationContext context =new ClassPathXmlApplicationContext("com/config/interfaces/spring.xml");
//        
//		OrderImpl o1 = (OrderImpl) context.getBean("oi");
//		o1.placeOrder();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		OrderImpl o1 = (OrderImpl) context.getBean("oi");
		o1.placeOrder();
		
	}

}
