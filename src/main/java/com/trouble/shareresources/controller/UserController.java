package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.entity.ResultType;
import com.trouble.shareresources.pojo.User;
import com.trouble.shareresources.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    @ResponseBody
    public ResultType login(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        User user = userService.checkLogin(jsonStr.getString("username"), "password");
        if (user==null){
            return new ResultType(false,"用户登陆失败");
        }else{
            return new ResultType(true,"用户登录成功");
        }

    }

    @RequestMapping("/register")
    @ResponseBody
    public ResultType register(@RequestBody String str){
        System.out.println("进入register");
        JSONObject jsonStr = JSON.parseObject(str);
        String username = jsonStr.getString("username");
        String password = jsonStr.getString("password");
        String telephone = jsonStr.getString("telephone");
        Boolean validateCode = jsonStr.getBoolean("validateCode");

        System.out.println("=============="+username+","+password+","+telephone+","+validateCode);
        if(validateCode){
            User user1 = new User(username, telephone, password, "USER");
            System.out.println(user1);
            User user = userService.saveUser(user1);
            System.out.println("out save:"+user);
            if (user!=null){
                return new ResultType(true,"注册成功");
            }else{
                return new ResultType(false,"注册失败，请重试");
            }
        }else{
            return new ResultType(false,"验证码不正确，请重试");
        }
    }

}
