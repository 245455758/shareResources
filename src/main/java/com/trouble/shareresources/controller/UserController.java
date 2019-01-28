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
    public User login(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String username = jsonStr.getString("username");
        String password = jsonStr.getString("password");
        User user = userService.checkLogin(username, password);
        User user1 = userService.checkLoginByTelephone(username, password);
        if (user!=null) return user;
        else if (user1!=null) return user1;
        else return null;
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

    /**
     * 在用户注册是判断数据库里是否有此手机号码，并返回相应信息
     * @param str
     * @return
     */
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

    /**
     * 在用户忘记密码时，查询数据库中是否有此手机号
     * @param str
     * @return
     */
    @RequestMapping("checkTelephoneExist")
    @ResponseBody
    public ResultType checkTelephoneExist(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        User user = userService.findUserByTelephone(jsonStr.getString("telephone"));
        if(user != null)    return  new ResultType(true,"手机号存在");
        else return new ResultType(false,"手机号不存在");
    }

    @RequestMapping("updatePasswordByTelephone")
    public ResultType updatePasswordByTelephone(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        System.out.println("This is updatePassword.telephone:"+jsonStr.getString("telephone")+",password"+jsonStr.getString("password"));
        int i = userService.updatePasswordByTelephone(jsonStr.getString("telephone"), jsonStr.getString("password"));
        if (i>0) return new ResultType(true,"更新密码成功");
        else return new ResultType(false,"更新密码失败");
    }

    @RequestMapping("/getPersonalInfo")
    @ResponseBody
    public User getPersonalInfo(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer userId = jsonStr.getInteger("userId");
        User userById = userService.getUserById(userId);
        return userById;
    }

    @RequestMapping("updatePersonalInfo")
    @ResponseBody
    public ResultType updatePersonalInfo(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer userId = jsonStr.getInteger("userId");
        String username = jsonStr.getString("username");
        String realname = jsonStr.getString("realname");
        String unit = jsonStr.getString("unit");
        String telephone = jsonStr.getString("telephone");
        String email = jsonStr.getString("email");
        int i = userService.updatePersonalInfo(userId, username, realname, unit, telephone, email);
        if (i>0) return new ResultType(true,"更新信息成功");
        else    return new ResultType(false,"更新用户信息失败");
    }

    //TODO **个人中心修改密码
}
