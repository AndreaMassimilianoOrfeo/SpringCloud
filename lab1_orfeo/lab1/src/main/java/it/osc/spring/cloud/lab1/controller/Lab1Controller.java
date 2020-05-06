package it.osc.spring.cloud.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lab1Controller {
	
	@GetMapping("/")
	public String lab1Get () 
	{
		return "hello";
	}

}
