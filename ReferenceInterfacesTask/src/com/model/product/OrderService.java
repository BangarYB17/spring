package com.model.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("product")
public class OrderService {
	@Autowired
    private ProductService productservice;

	public ProductService getProductservice() {
		return productservice;
	}

	public void setProductservice(ProductService productservice) {
		this.productservice = productservice;
	}
     
	public void createOrder() {
		productservice.orderProduct();
	}
       
}
