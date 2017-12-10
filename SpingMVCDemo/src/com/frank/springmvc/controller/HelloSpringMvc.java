package com.frank.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMvc {
	
	@RequestMapping("/hello")
	public String test(){
		
		System.out.print("test");
		
		return "hello";
	}
}
