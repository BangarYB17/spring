package com.model.product;

import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

	@Override
	public void orderProduct() {
		System.out.println("Product Ordered Successfully!");

	}

}
