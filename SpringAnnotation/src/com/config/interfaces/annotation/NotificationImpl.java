package com.config.interfaces.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("n1")
public class NotificationImpl implements NotificationService {
	    
	@Autowired
	
	private MessageService messageService;
	
        public void notifyUser() {
           messageService.sendMsg();
        }
}
