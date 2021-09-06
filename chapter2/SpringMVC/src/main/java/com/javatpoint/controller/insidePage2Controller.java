package com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class insidePage2Controller {
	
	@RequestMapping("/insidePage2")
	public String displayInsidePage2() {
		return "insidePage2";
	}

}
