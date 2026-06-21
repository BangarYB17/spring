package com.model.service;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
      public void processPayment() {
    	  System.out.println("Payment is processing");
      }
}
