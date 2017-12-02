package com.xteam.purchase.user.service.impl;

import com.xteam.purchase.user.entity.User;
import com.xteam.purchase.user.mapper.UserMapper;
import com.xteam.purchase.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuliyun-ds on 2017/12/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User doGet(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
