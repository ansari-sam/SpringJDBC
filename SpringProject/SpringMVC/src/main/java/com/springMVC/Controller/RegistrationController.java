package com.springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springMVC.entities.Customer;

@Controller
public class RegistrationController {
	
	@RequestMapping("/registration")
	public String register() {
		
		return "registration";
	}
	
	@RequestMapping(path="/cusProcessForm",method = RequestMethod.POST)
	public String processForm(@ModelAttribute("customer") Customer customer,BindingResult result) {
		if(result.hasErrors()) {
			return "registration";
		}
		System.out.println(customer);
		
		return "cusProcessForm";
	}

}
