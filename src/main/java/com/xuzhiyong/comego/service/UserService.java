package com.xuzhiyong.comego.service;

import com.xuzhiyong.comego.entity.User;

public interface UserService {
	
	public User getUserInfoByUserId(long userId);

	public void registerUser(User user);
}
