package com.model.pizzaservice;

import org.springframework.stereotype.Component;

@Component
public class PizzaService implements FoodService {

	@Override
	public void orderFood() {
		System.out.println("Pizza Ordered Successfully!");

	}

}
