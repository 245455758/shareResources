package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.UserMapper;
import com.trouble.shareresources.pojo.User;
import com.trouble.shareresources.pojo.UserExample;
import com.trouble.shareresources.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User saveUser(User user) {
        int insert = userMapper.insert(user);
        if (insert==0){
            return  null;
        }else{
            return user;
        }
    }

    @Override
    public User checkLogin(String name, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(name);
        criteria.andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(example);
        if (users!=null){
            return users.get(0);
        }else{
            return null;
        }
    }
}