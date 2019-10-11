package com.wyg.jd.controller;

import com.wyg.jd.entities.User;
import com.wyg.jd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("user")
    @ResponseBody
    public User user(){
       User u = userMapper.listAll();

        return u;
    }
}
