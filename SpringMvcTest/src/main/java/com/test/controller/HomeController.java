package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//	   @RequestMapping("/home")
//        public ModelAndView home(Model model) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("home");
//		modelAndView.addObject("Name", "Yogeshwar");
//		modelAndView.addObject("Id", 101);
//		modelAndView.addObject("Salary", 90000);
//		modelAndView.addObject("City", "Pune");
//		return modelAndView; }

	@RequestMapping("/home")
	 @ResponseBody
	 public String form() {
		return  "<html>" +
		           "<body>" +
		           "<h2>Student Form</h2>" +
		           "<form action='save' method='post'>" +
		           "Name:<input type='text' name='name'>" +"<br><br>"+
		           "ID:<input type='number' name='id'>"+"<br><br>"+
		           "Salary:<input type='number' name='salary'>"+"<br><br>"+
		           "City:<input type='text' name='city'>"+"<br><br>"+
		           "<input type='submit' value='Save'>" +
		           "</form>" +
		           "</body>" +
		           "</html>";
	}
	  @PostMapping("/save")
	    @ResponseBody
	    public String save(
	            @RequestParam String name,
	            @RequestParam int id,
	            @RequestParam int salary,
	            @RequestParam String city) {

	        return "Emp ID: " + id +"<br>"+
	               " Emp Name: " + name +"<br>"+
	               " Emp Salary: " + salary +"<br>"+
	               " Emp City: " + city;
	    }
    	   
}         

