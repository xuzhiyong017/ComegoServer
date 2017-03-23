package com.xuzhiyong.comego.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuzhiyong.comego.dao.UserDao;
import com.xuzhiyong.comego.entity.User;
import com.xuzhiyong.comego.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public User getUserInfoByUserId(long userId) {
		// TODO Auto-generated method stub
		return dao.getUserById(userId);
	}

	
	
}
