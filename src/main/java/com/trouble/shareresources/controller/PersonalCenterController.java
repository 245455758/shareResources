package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.entity.PersonalCenterCourseEntity;
import com.trouble.shareresources.pojo.Course;
import com.trouble.shareresources.pojo.UserCourse;
import com.trouble.shareresources.service.CourseService;
import com.trouble.shareresources.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("personalCenter")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PersonalCenterController {

    @Autowired
    private UserCourseService userCourseService;
    @Autowired
    private CourseService courseService;

    @RequestMapping("getPersonalCourseInfo")
    @ResponseBody
    public List<PersonalCenterCourseEntity> getPersonalCourseInfo(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        List<PersonalCenterCourseEntity> personalCenterCourseEntities = new ArrayList<PersonalCenterCourseEntity>();
        List<UserCourse> userCourses = userCourseService.getCoursesByUserId(jsonStr.getInteger("userId"));
        if (userCourses!=null && userCourses.size()>0){
            for (UserCourse userCourse : userCourses){
                Course course = courseService.getCourseById(userCourse.getCourseId());
                PersonalCenterCourseEntity personalCenterCourseEntity = new PersonalCenterCourseEntity();
                personalCenterCourseEntity.setStatus(userCourse.getStatus());
                personalCenterCourseEntity.setCourseId(course.getId());
                personalCenterCourseEntity.setCourseName(course.getCourseName());
                personalCenterCourseEntity.setCourseSchool(course.getSchool());
                personalCenterCourseEntity.setPicPath(course.getIntroductionPic());
                personalCenterCourseEntities.add(personalCenterCourseEntity);
            }
        }
        System.out.println(personalCenterCourseEntities);
        return personalCenterCourseEntities;
    }

}
