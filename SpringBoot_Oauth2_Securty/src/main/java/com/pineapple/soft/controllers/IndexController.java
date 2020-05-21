package com.pineapple.soft.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pineapple.soft.entities.User;
import com.pineapple.soft.services.RegistrationService;


@Controller
public class IndexController {
	
	
	
	@GetMapping(value="/")
	public String indexPage()
	{
		return "index";
		
		
	}
	
	
	@RequestMapping(value = "/newRegistration", method = RequestMethod.GET)
    public String newRegistration(Model model) {
        model.addAttribute("newUser", new 	User());
        return "registrationForm";
    }
	
	@Autowired
    private RegistrationService userService;
	
	@RequestMapping(value = "/newRegistration", method = RequestMethod.POST)
    public ModelAndView registration(@ModelAttribute("newUser")User userData, BindingResult bindingResult,Model model) {
    
       userService.insertData(userData);
       System.out.print("Call Done");
       
        ModelAndView mv = new ModelAndView("successfullyRegistration");
		
        mv.addObject("name",userData.getFullname());
        System.out.print("Call Done");

		return mv;
		
        
    }
	
	
	
	


}
