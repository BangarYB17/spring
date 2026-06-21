package com.test.SpringHibernateDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("productdao")

public class ProductDaoImpl implements ProductDao {
	
	 @Autowired
	 private HibernateTemplate hibernateTemplate;
	 
      
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

//	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	//@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);

	}

	//@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	
	public Product findSingleData(int id) {
		Product product = hibernateTemplate.get(Product.class,id);
		return product;
	}

	
	public List<Product> findAll() {
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}

}
