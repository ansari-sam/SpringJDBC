package com.springMVC.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model m) {
		
//		List<String> frnd=new ArrayList<String>();
//		frnd.add("Anshu");
//		frnd.add("bora");
//		frnd.add("Aman");
//		frnd.add("Deepak");
//		frnd.add("Boss");
//		m.addAttribute("f", frnd);
		
		System.out.println("run index page");
		return "index";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("search") String query) {
		RedirectView view= new RedirectView();
		if(query.isEmpty()) {
			view.setUrl("/SpringMVC");
		}else {
			String url="https://google.com/search?q="+query;
			view.setUrl(url);
		}
		return view;
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("run about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("run help page");
		ModelAndView modelAndView= new ModelAndView();
		
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(89);
		marks.add(86);
		marks.add(85);
		marks.add(90);
		marks.add(75);
		modelAndView.addObject("name","Saddam");
		modelAndView.addObject("roll", 7210637);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		modelAndView.addObject("marks", marks);
		modelAndView.setViewName("help");
		
		
		return modelAndView;
	}

}
