package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.data.copy.User;

@Controller
public class UserController {
       @GetMapping("/user")
       public ModelAndView showRegPage(Model model) {
    	   ModelAndView mv = new ModelAndView();
    	   mv.setViewName("user");
    	   return mv;   
       }
       
       @RequestMapping(value="/registerUser", method=RequestMethod.POST)
       public ModelAndView registerUser(@ModelAttribute("u1")User u1) {
    	   System.out.println(u1);
    	   ModelAndView mv =new ModelAndView();
    	   mv.setViewName("user");
    	   return mv;
       }
       
       @RequestMapping(value ="/result",method=RequestMethod.POST)
       public ModelAndView result(@ModelAttribute("result")User result) {
    	   ModelAndView mv = new ModelAndView();
    	   mv.setViewName("result");
    	   return mv;
       }
}
