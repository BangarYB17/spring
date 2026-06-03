package com.config.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//@Configuration()
@Component("oi")

public class OrderImpl implements OrderInterface {

	@Autowired
	private OrderDaoInterface dao;

	public OrderDaoInterface getDao() {
		return dao;
	}

	public void setDao(OrderDaoInterface dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
           System.out.println("inside orderImpl class");
           dao.createOrder();
	}
	@Override
	public void sendMsg() {
		System.out.println("order placed successfully!");
		
	}

}
