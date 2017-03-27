package com.xuzhiyong.comego.dao;

import com.xuzhiyong.comego.entity.User;

public interface UserDao {

	public User getUserById(long userId);

	public void registerUser(User user);
}
