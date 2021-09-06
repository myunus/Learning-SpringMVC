package com.javatpoint.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("login") 
	public String displayLogin() {
		return "login";
	}
	
	
	public String displayAfterLogin(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		if(pass.equals("admin")) {
			String msg = "Hello, " + name;
			model.addAttribute("message", msg);
			return "loginSuccess";
		} else {
			String msg  = "Sorry " + name + ", you entered an incorrect password!";
			model.addAttribute("message", msg);
			return "loginFailed";
		}
	}

}
