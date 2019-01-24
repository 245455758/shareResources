package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.entity.ResultType;
import com.trouble.shareresources.pojo.UserLecture;
import com.trouble.shareresources.service.UserLectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userLecture")
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserLectureController {

    @Autowired
    private UserLectureService userLectureService;

    @RequestMapping("saveUserLectureInfo")
    @ResponseBody
    public ResultType saveUserCourseInfo(@RequestBody String str){
        System.out.println("进入saveUserCourseInfo");
        JSONObject jsonStr = JSON.parseObject(str);
        UserLecture userLecture = new UserLecture();
        userLecture.setUserId(jsonStr.getInteger("userId"));
        userLecture.setCoursrId(jsonStr.getInteger("courseId"));
        userLecture.setUnitId(jsonStr.getInteger("unitId"));
        userLecture.setLectureId(jsonStr.getInteger("lectureId"));
        userLecture.setStatus(jsonStr.getInteger("status"));
        int i = userLectureService.saveUserLectureInfo(userLecture);
        if (i>0) return new ResultType(true,"插入成功");
        return new ResultType(false,"插入失败");
    }

    @RequestMapping("userIsLearning")
    @ResponseBody
    public List<UserLecture> userIsLearning(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer userId = jsonStr.getInteger("userId");
        Integer courseId = jsonStr.getInteger("courseId");
        Integer unitId = jsonStr.getInteger("unitId");
        List<UserLecture> lectureStatusBy3Ids = userLectureService.findLectureStatusBy3Ids(userId, courseId, unitId);
        return lectureStatusBy3Ids;
    }

}
