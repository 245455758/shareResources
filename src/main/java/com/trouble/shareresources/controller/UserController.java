package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.entity.ResultType;
import com.trouble.shareresources.pojo.User;
import com.trouble.shareresources.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public ResultType login(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String username = jsonStr.getString("username");
        String password = jsonStr.getString("password");
        User user = userService.checkLogin(username, password);
        User user1 = userService.checkLoginByTelephone(username, password);
        if (user==null&&user1==null){
            return new ResultType(false,"用户登陆失败");
        }else{
            return new ResultType(true,"用户登录成功");
        }
    }

    @RequestMapping("/register")
    @ResponseBody
    public ResultType register(@RequestBody String str){
//        System.out.println("进入register");
        JSONObject jsonStr = JSON.parseObject(str);
        String username = jsonStr.getString("username");
        String password = jsonStr.getString("password");
        String telephone = jsonStr.getString("telephone");
        Boolean validateCode = jsonStr.getBoolean("validateCode");
        if(validateCode){
            User user1 = new User(username, telephone, password, "USER");
            int registerRes = userService.saveUser(user1);
            if (registerRes>0){
                return new ResultType(true,"注册成功");
            }else{
                return new ResultType(false,"注册失败，请重试");
            }
        }else{
            return new ResultType(false,"验证码不正确，请重试");
        }
    }

    @RequestMapping("checkUsername")
    @ResponseBody
    public ResultType checkUsername(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        User user = userService.findUserByUserName(jsonStr.getString("username"));
        if (user !=null) return new ResultType(false,"用户名已存在");
        else return new ResultType(true,"用户名可用");
    }

    @RequestMapping("checkTelephone")
    @ResponseBody
    public ResultType checkTelephone(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        User user = userService.findUserByTelephone(jsonStr.getString("telephone"));
        if (user !=null){
            System.out.println(user);
            return new ResultType(false,"手机号已存在");
        }
        else return new ResultType(true,"手机号可用");
    }
}
