package com.config.interfaces;

import org.springframework.stereotype.Component;

@Component()
public class OrderDaoImpl implements OrderDaoInterface {

	@Override
	public void createOrder() {
		System.out.println("inside Order Dao Implementation");

	}
	@Override
	public void notifyUser() {
		
	}

}
