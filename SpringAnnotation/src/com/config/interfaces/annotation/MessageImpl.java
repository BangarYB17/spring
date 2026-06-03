package com.config.interfaces.annotation;

import org.springframework.stereotype.Component;

@Component
public class MessageImpl implements MessageService {
       public void sendMsg() {
    	   System.out.println("Message sent");
       }
}
