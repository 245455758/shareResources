package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.entity.ResultType;
import com.trouble.shareresources.pojo.UserCourse;
import com.trouble.shareresources.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userCourse")
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserCourseController {

    @Autowired
    private UserCourseService userCourseService;

    @RequestMapping("saveUserCourseInfo")
    @ResponseBody
    public ResultType saveUserCourseInfo(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        UserCourse userCourse = new UserCourse();
        userCourse.setUserId(jsonStr.getInteger("userId"));
        userCourse.setCourseId(jsonStr.getInteger("courseId"));
        userCourse.setStatus(1);//默认为1，表示在学习中
        int i = userCourseService.saveUserCourseInfo(userCourse);
        if (i>0) return new ResultType(true,"插入成功");
        return new ResultType(false,"插入失败");
    }

    @RequestMapping("userIsLearning")
    @ResponseBody
    public int userIsLearning(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer userId = jsonStr.getInteger("userId");
        Integer courseId = jsonStr.getInteger("courseId");
        return userCourseService.findCourseByUserAndCourse(userId, courseId);
    }


}
