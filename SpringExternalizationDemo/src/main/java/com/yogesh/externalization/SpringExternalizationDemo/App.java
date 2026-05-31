package com.yogesh.externalization.SpringExternalizationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        MyDao m = (MyDao) context.getBean("mydao");
        System.out.println(m);
        
    }
}
