package com.test.SpringHibernateDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/test/SpringHibernateDemo/config.xml");
        ProductDaoImpl dao = (ProductDaoImpl) context.getBean("productdao");
        
//        Product product= new Product();
//        product.setId(104);
//        product.setName("Iphone");
//        product.setDesc("Iphone 15 pro,new launch");
//        product.setPrice(452.52);
//        dao.create(product);
      
  //        System.out.println("Product Saved Successfully");
        
       /* Product product1 = new Product();
        product1.setId(101);
        product1.setName("Samsung");
        product1.setDesc("Samsung is providing getter camera");
        product1.setPrice(300.99);
        dao.update(product1);
        System.out.println("Product Updated Successfully"); */
        
       /* Product product2 = new Product();
        product2.setId(104);
//        product2.setName("Samsung");
//        product2.setDesc("Samsung is providing getter camera");
//        product2.setPrice(300.99);
        dao.delete(product2);
        System.out.println("Product deleted Successfully"); */
        
       // System.out.println(dao.findSingleData(101));
        
        System.out.println(dao.findAll()); 
        
        
        
    }
}
