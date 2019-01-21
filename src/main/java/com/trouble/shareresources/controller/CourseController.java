package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.trouble.shareresources.pojo.Course;
import com.trouble.shareresources.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("getAllCoursesNum")
    @ResponseBody
    public int getAllCoursesNum(){
        return courseService.getAllCoursesNum();
    }

    @RequestMapping("getCoursesSummary")
    @ResponseBody
    public List<Course> getCoursesSummary(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        PageHelper.startPage(pageNo, pageSize);
        return courseService.getCoursesSummary();
    }
    @RequestMapping("getCourseRecommendSummary")
    @ResponseBody
    public List<Course> getCourseRecommendSummary(){
        return courseService.getRecommendCoursesSummary();
    }

    @RequestMapping("getCourseById")
    @ResponseBody
    public Course getCourseById(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        Course courseById = courseService.getCourseById(id);
        System.out.println(courseById.getIntroductionVideo()+"!!!!!!!!!!!!!!!!!!");
        return courseById;
    }

}
