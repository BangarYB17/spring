package com.model.SpringAop;

import java.security.Provider.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.AppConfig;
import com.model.service.PaymentService;

public class DemoApplication {
	   public static void main(String[] args) {
		   ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	       PaymentService  p1 = context.getBean(PaymentService.class);
	       p1.processPayment();
	   }
      
           
}
