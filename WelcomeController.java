package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/Welcome there")
	public String welcome(Model model) {
		model.addAttribute("message", "Hello, It is a java application!");
		return "Welcome there";
	}

}
