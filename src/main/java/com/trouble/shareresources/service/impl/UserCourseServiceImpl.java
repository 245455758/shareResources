package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.UserCourseMapper;
import com.trouble.shareresources.pojo.UserCourse;
import com.trouble.shareresources.pojo.UserCourseExample;
import com.trouble.shareresources.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCourseServiceImpl implements UserCourseService {

    @Autowired
    private UserCourseMapper userCourseMapper;

    @Override
    public int saveUserCourseInfo(UserCourse userCourse) {
        return userCourseMapper.insertSelective(userCourse);
    }

    @Override
    public int findCourseByUserAndCourse(Integer userId, Integer courseId) {
        UserCourseExample example = new UserCourseExample();
        UserCourseExample.Criteria criteria = example.createCriteria();
        criteria.andCourseIdEqualTo(courseId);
        criteria.andUserIdEqualTo(userId);
        List<UserCourse> userCourses = userCourseMapper.selectByExample(example);
        if (userCourses!=null&&userCourses.size()>0) return userCourses.get(0).getStatus();
        return -1;
    }
}
