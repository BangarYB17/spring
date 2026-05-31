package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	   @Value("Jayesh Nagya")
       private String title;
	   
	   @Value("cleaner")
       private String Position;
    
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	
	@Override
	public String toString() {
		return "Profile [title=" + title + ", Position=" + Position + "]";
	}
       
       
} 
