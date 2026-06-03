package com.model.pizzaservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.model.pizzaservice")
public class App {

	public static void main(String[] args) {
          ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
          
          FoodController  food = (FoodController) context.getBean("pizza");
          food.PlaceOrder();
          
	}

}
