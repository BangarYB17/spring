package com.model.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	   @Before("execution(* com.model.service.*.*(..))")
	   //* --> return type
	   // 2nd * --> this any class
	   //3rd * --> is any method
	   //(..) --> method with number of parameters
       public void loggingBefore() {
		   //joint point
    	   System.out.println("Logging before method execution");
       }
	   
	   @After("execution(* com.model.service.*.*(..))")
	   public void loggingAfter() {
		   //joint point
    	   System.out.println("After Payment Processing...");
       }
}
