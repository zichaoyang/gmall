package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: gmall->UserController
 * @description:
 * @author: zcy
 * @create: 2019-11-12 21:30
 **/
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("index")
    @ResponseBody
    public  String index(){
        return  "hello user";
    }
}
