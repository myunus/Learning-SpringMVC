package com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class insidePage1Controller {
	
	@RequestMapping("/insidePage1")
	public String displayInsidePage1() {
		return "insidePage1";
	}
}
