package com.xteam.purchase.user.controller;

import com.xteam.purchase.user.entity.User;
import com.xteam.purchase.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuliyun-ds on 2017/12/1.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "user")
    public User doGet(Integer id){
        return userService.doGet(id);
    }
}
