package com.l.mk.demo.usermanager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	private static Map<String,String> map = null;
	
	static {
		map = new HashMap<String,String>();
		map.put("admin","123456");
		map.put("管理员","123" );
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String username,
						@RequestParam String password,
						Model model) {
		if (map.get(username)!=null && 
				map.get(username).equals(password)) {
		    model.addAttribute("name", username);
		    return "/show";
		}
		
		model.addAttribute("error", "用户密码错误");
		return "/index";
		
	}
	
	@RequestMapping({"/","/index"})
	public String goHome() {
		return "/index";
	}
}
