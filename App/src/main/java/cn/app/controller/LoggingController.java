package cn.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggingController {

	
	@RequestMapping("/login")
	public String login() {
		return "login/enter";
	}
	
	
	@RequestMapping("/login-back")
	public String login2() {
		return "login/login-back";
	}
	
	@RequestMapping("/login-developer")
	public String login3() {
		return "login/login-developer";
	}
}
