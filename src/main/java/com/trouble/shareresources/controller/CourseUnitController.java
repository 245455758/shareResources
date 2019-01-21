package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.pojo.CourseUnit;
import com.trouble.shareresources.service.CourseUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courseUnit")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CourseUnitController {

    @Autowired
    private CourseUnitService courseUnitService;

    @RequestMapping("getUnitsByCourseId")
    public List<CourseUnit> getCourseUnitByCourseId(@RequestBody String str){
        JSONObject jsonStrr = JSON.parseObject(str);
        return courseUnitService.getUnitsByCourseId(jsonStrr.getInteger("courseId"));
    }



}
