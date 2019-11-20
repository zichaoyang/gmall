package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: gmall->UserServiceImpl
 * @description:
 * @author: zcy
 * @create: 2019-11-12 21:31
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
