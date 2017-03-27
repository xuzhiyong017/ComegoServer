package com.xuzhiyong.comego.dao;

import com.scienjus.authorization.repository.UserModelRepository;
import com.xuzhiyong.comego.entity.User;

/**
 * Created by 91299 on 2017/3/25   0025.
 */
public class UserRepository implements UserModelRepository<User>{

    @Override
    public User getCurrentUser(String s) {
        return null;
    }
}
