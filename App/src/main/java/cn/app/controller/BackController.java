package cn.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackController {

	
	
	
	@RequestMapping("/m_b_display")
	public String add() {
		return "m_b_display";
	}
}
