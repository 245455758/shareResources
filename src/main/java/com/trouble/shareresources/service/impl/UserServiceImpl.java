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
    public int saveUser(User user) {
       return userMapper.insert(user);
    }

    @Override
    public User checkLogin(String name, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(name);
        criteria.andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(example);
        if (users!=null&&users.size()>0){
            return users.get(0);
        }else{
            return null;
        }
    }
    @Override
    public User checkLoginByTelephone(String phobeNumber,String password){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPasswordEqualTo(password);
        criteria.andTelephoneEqualTo(phobeNumber);
        List<User> users = userMapper.selectByExample(example);
        if (users!=null&&users.size()>0){
            return users.get(0);
        }else{
            return null;
        }
    }

    @Override
    public User findUserByUserName(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(example);
        return users.size()>0?users.get(0):null;
    }

    @Override
    public User findUserByTelephone(String telephone) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andTelephoneEqualTo(telephone);
        List<User> users = userMapper.selectByExample(example);
        return users.size()>0?users.get(0):null;
    }

    @Override
    public int updatePasswordByTelephone(String telephone, String password) {
        User user = new User();
        user.setPassword(password);
        user.setTelephone(telephone);
        return userMapper.updatePasswordByTelephone(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatePersonalInfo(Integer userId, String username, String realname, String unit, String telephone, String email) {
        User record = new User();
        if (userId!=null && userId!=0) record.setId(userId);
        if (username!=null && !"".equals(username)) record.setUsername(username);
        if (realname!=null && !"".equals(realname)) record.setRealname(realname);
        if (unit!=null && !"".equals(unit)) record.setUnit(unit);
        if (telephone!=null && !"".equals(telephone)) record.setTelephone(telephone);
        if (email!=null && !"".equals(email)) record.setEmail(email);
        return userMapper.updateByPrimaryKeySelective(record);
    }


}