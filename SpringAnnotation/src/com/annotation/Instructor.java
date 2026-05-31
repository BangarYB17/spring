package com.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst") 
@Scope("prototype")
public class Instructor {
//	   @Value("101")  or 
//	   @Value("#{104+10}") // always execute Annotation and expression value
//       private int id=420;

//	   @Value("#{T(java.lang.Math).abs(-40)}")
//	   @Value("#{T(java.lang.Math).min(30,40)}")
//	   @Value("#{T(java.lang.Math).max(30,40)}")
//	   @Value("#{T(java.lang.Math).sqrt(25)}")
//	   @Value("#{'Ram'.length()}")  //3
	   @Value("#{T(java.lang.Math).pow(2,3)}")
	   private int id;
	   
//	   @Value("#{10>5}")
//	   @Value("#{10<5}")
//	   @Value("#{10<5 || 10>5}")
	   @Value("#{10<5 || 10>5}")
	   private boolean status;
	   
//	   @Value("#{'SpringBoot'.substring(0,6)}")
//	   @Value("#{{'SpringBoot','Spring','JDBC'}[1]}")
//	   @Value("#{systemEnvironment['MAVEN_HOME']}")
//	   @Value("#{systemProperties['user.name']}")
//	   @Value("#{T(com.annotation.Utility).getCompany()}")
//	   @Value("#{T(com.annotation.Utility).Country}")
	   @Value("#{@utility.getName()}")
       private String name;
       
//	   @Value("#{topics}")
	   @Value("#{{'SpringBoot','Spring','JDBC'}}")
	   private List<String> topics;
	   
	   @Autowired
	   private Profile profile;
	   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", status=" + status + ", name=" + name + ", topics=" + topics + ", profile="
				+ profile + "]";
	}
	
	 
}
