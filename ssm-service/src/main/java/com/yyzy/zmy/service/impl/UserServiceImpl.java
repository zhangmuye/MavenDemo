package com.yyzy.zmy.service.impl;

import com.yyzy.zmy.entry.User;
import com.yyzy.zmy.mapper.UserMapper;
import com.yyzy.zmy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
