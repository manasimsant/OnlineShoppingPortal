package org.dteja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/index")
	public String showHomepage(){
		return "index";
	}
	
	@RequestMapping("/aboutus")
	public String showAboutUs(){
		return "aboutus";
	}
	
	@RequestMapping("/contactus")
	public String showContactUs(){
		return "contactus";
	}
	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}
	
	@RequestMapping("/register")
	public String showRegister(){
		return "register";
	}

}
