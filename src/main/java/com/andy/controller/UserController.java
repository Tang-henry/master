package com.andy.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger("UserController");
	/**
	 * @MethodName login  
	 * @Description 用户登录
	 * @return
	 */
	@ApiIgnore
	@RequestMapping("/login")
	public String login(String userName,String password) {
		Subject subject = SecurityUtils.getSubject();
		subject.login(new UsernamePasswordToken(userName, password));
		if(subject.isAuthenticated() && subject.isRemembered()){
			Session session = subject.getSession(false);
			Map<String, String> userInfo = new HashMap<>();
			userInfo.put(userName, password);
			session.setAttribute("USER_INFO", userInfo);
			logger.debug("身份验证通过");
			return "index";
		}
		logger.debug("身份验证不通过");
		return "login";
	}
}
