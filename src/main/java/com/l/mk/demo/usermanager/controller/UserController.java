package com.l.mk.demo.usermanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@RequestMapping("/login")
	public String login(@RequestParam String username,
						@RequestParam String password,
						Model model) {
		System.out.println(username + "：" + password);
		model.addAttribute("name", username);
		return "/show";
	}
	
	@RequestMapping({"/","/index"})
	public String goHome() {
		return "/index";
	}
}
