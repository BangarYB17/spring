package com.model.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.model.product")
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		OrderService order = (OrderService) context.getBean("product");
		order.createOrder();
	}

}
