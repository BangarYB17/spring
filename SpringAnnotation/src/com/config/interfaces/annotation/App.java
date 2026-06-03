package com.config.interfaces.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.config.interfaces.annotation")
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//		NotificationImpl impl = (NotificationImpl) context.getBean(NotificationService.class);
		NotificationImpl impl = (NotificationImpl) context.getBean("n1");
		impl.notifyUser();

	}

}
