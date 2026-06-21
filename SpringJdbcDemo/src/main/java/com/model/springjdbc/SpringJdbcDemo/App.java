package com.model.springjdbc.SpringJdbcDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/model/springjdbc/SpringJdbcDemo/spring.xml");
       JdbcTemplate template =(JdbcTemplate) context.getBean("jdbcTemplate");
       String sql = "insert into employee values(?,?,?)";
       int result = template.update(sql,1,"Jayesh","Sheru");
       System.out.println("Number of records inserted are: "+result);
    }
}
