package com.springMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.Service.UserService;
import com.springMVC.entities.User;

@Controller
//@RequestMapping("/contactus")
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("title", "welcome to SoftBlog Partner");
		m.addAttribute("sub", "Be the expertise partner with us ");
	}

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String contact() {

		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processform(@ModelAttribute("user") User user, Model m) {
		
		if(user.getName().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			
			return "redirect:/contact";
			
		}else {
			int id = this.userService.createUser(user);
			System.out.println(user);
			m.addAttribute("msg", id);
		}
		
		return "processform";
	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String processform(@RequestParam("name") String name, @RequestParam("email") String email,
//			@RequestParam("password") String password, Model m) {
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(password);
//		m.addAttribute("name", name);
//		m.addAttribute("email", email);
//		m.addAttribute("password", password);
//
//		return "processform";
//	}

}
