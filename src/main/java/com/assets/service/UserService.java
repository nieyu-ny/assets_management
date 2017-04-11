package com.assets.service;

import com.assets.entity.User;

import java.util.List;

/**
 * Created by user on 2016/5/6.
 */
public interface UserService {

    User selectUserByUserName(String loginName);

    User selectByPrimaryKey(Integer id);

    int insert(User user);

}
