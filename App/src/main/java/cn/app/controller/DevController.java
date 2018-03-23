package cn.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dev")
public class DevController {
	
    //d_b_display.jsp   开发者后台首页展示
	@RequestMapping("/first_display")
	public String ss() {
	return "dev/d_b_display";	
	}
	

	//dev_app_maintenance.jsp   开发者维护界面
	@RequestMapping("/maintenance")
	public String maintenance() {
	return "dev/dev_app_maintenance";	
	}
	
	@RequestMapping("/add")
	public String add() {
	return "dev/app_add";	
	}
	
	@RequestMapping("/modify")
	public String modify() {
	return "dev/modify_app";	
	}

}
