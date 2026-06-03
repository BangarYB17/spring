package com.bankservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.bankservice")
public class App {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
		HdfcImpl hi = (HdfcImpl) context.getBean("hdfc");
//		hi.show();      // welcome to HDFC Bank
		hi.showBank();

	}

}
