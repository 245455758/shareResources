package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.pojo.CourseUnitLecture;
import com.trouble.shareresources.service.CourseUnitLectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unitLecture")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CourseUnitLectureController {

    @Autowired
    private CourseUnitLectureService courseUnitLectureService;

    @RequestMapping("getLecturesByUnitId")
    @ResponseBody
    public List<CourseUnitLecture> getCourseUnitLectureByUnitId(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        return  courseUnitLectureService.getUnitLecturesByUnitId(jsonStr.getInteger("unitId"));
    }

}
