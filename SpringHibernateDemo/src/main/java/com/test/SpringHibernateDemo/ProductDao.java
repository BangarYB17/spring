package com.test.SpringHibernateDemo;

import java.util.List;

public interface ProductDao {
       int create(Product product);
       void update(Product product);
       void delete(Product product);
       Product findSingleData(int id);
       List<Product> findAll();
       
}
