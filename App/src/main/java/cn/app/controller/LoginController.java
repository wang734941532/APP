package cn.app.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.app.pojo.Back_User;
import cn.app.service.Back_UserService;

@Controller
public class LoginController {
	@Resource
	private Back_UserService back_UserService;
	
	public void setBack_UserService(Back_UserService back_UserService) {
		this.back_UserService = back_UserService;
	}


	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "login/enter";
	}
	
	
	@RequestMapping(value="/login-back",method=RequestMethod.GET)
	public String login2() {
		return "login/login-back";
	}
	@RequestMapping(value="/login-back",method=RequestMethod.POST)
	public String login2_post(String userCode,
			String userPassword,
			HttpSession session,
			Model model) {
		System.out.println("admin,login ============ " );
		//调用service方法，进行用户匹配
		Back_User bUser=back_UserService.login(userCode, userPassword);
		if(null != bUser){//登录成功
			//放入session
			session.setAttribute("Back_UserSession", bUser);
			
			return "index";
		}else{
			//页面跳转（login.jsp）带出提示信息--转发
			model.addAttribute("error", "用户名或密码不正确");
			return "login/login-back";
		}
		
	}
	@RequestMapping("/login-developer")
	public String login3() {
		return "login/login-developer";
	}
}
