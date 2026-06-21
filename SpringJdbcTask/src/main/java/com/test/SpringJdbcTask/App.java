package com.test.SpringJdbcTask;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/test/SpringJdbcTask/spring.xml");
        CustomerDaoImpl cust1 = (CustomerDaoImpl) context.getBean("customerdao");
       
        //1.Inserting Records
       /* cust1.save(new Customer("Vaibhav","Jalgaon","7745896523"));
        System.out.println("Record inserted successfully!"); */
        
        //2.Print All Records
       /*List<Customer> customer = cust1.FindAll();
        for(Customer c:customer) {
        	System.out.println(c.getCust_id()+" "+c.getCustomerName()+" "+c.getCity()+" "+c.getMobile_no());
        }; */
        
        // 3.Print Single Record
        List<Customer> customer = cust1.FetchData(3);
        for(Customer c:customer) {
        	System.out.println(c.getCust_id()+" "+c.getCustomerName()+" "+c.getCity()+" "+c.getMobile_no());
        }; 
        
        //4.Update Record 
        /*Customer c = new Customer();
        c.setCust_id(3);
        c.setCustomerName("Yogeshwar");
        c.setCity("Nandurbar");
        c.setMobile_no("8080181671");
        
        cust1.update(c);
        System.out.println("Record updated Successfully!");  */
        
        //5.Delete Record
        /*cust1.delete(4);
        System.out.println("Record deleted successfully!"); */
    }
}
