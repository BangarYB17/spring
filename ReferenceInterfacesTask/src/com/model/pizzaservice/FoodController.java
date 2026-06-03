package com.model.pizzaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pizza")
public class FoodController {
	@Autowired
    private FoodService foodservice;
 
	public FoodService getFoodservice() {
		return foodservice;
	}

	public void setFoodservice(FoodService foodservice) {
		this.foodservice = foodservice;
	}

	public void PlaceOrder() {
		foodservice.orderFood();
	}
	
}  
