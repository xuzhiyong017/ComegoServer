package com.xuzhiyong.comego.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuzhiyong.comego.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuzhiyong.comego.entity.User;

@Controller
@RequestMapping("/user")
public class UserServiceController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	@ResponseBody
	private User getUserInfo(HttpServletRequest request,HttpServletResponse response) {
		return userService.getUserInfoByUserId(Long.valueOf(request.getParameter("userId")));
	}
	
}
