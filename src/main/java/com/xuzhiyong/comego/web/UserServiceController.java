package com.xuzhiyong.comego.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scienjus.authorization.annotation.Authorization;
import com.scienjus.authorization.manager.impl.DBTokenManager;
import com.xuzhiyong.comego.dto.Result;
import com.xuzhiyong.comego.service.UserService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuzhiyong.comego.entity.User;
import protocol.Comego;

import java.io.IOException;

@Controller
@RequestMapping("/comego")
public class UserServiceController{

	@Autowired
	UserService userService;

	@Autowired
	private DBTokenManager manager;


	@Authorization
	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	@ResponseBody
	private Result<User> getUserInfo(HttpServletRequest request, HttpServletResponse response) {
		manager.createRelationship("xuzhiyong","fjosdjfiosjfiosfjiosjfiosd");
		return new Result<User>(true,userService.getUserInfoByUserId(Long.valueOf(request.getParameter("userId"))));
	}

	@ResponseBody
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	private Result<String> registerUser(User user){
		manager.createRelationship("xuzhiyong","fjosdjfiosjfiosfjiosjfiosd");
		Comego.UserInfo info = Comego.UserInfo.newBuilder().setUid(1000L).setAddress("广州").build();
		String result= new String(info.toByteArray());
		return new Result<>(true,result);
	}

	@ResponseBody
	@RequestMapping(value = "/send",method = RequestMethod.POST)
	private String test(HttpServletRequest request, HttpServletResponse response){
		String json = request.getParameter("json");
		System.out.println(json);
		return "";
	}

}
