package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.UserCourse;

import java.util.List;

public interface UserCourseService {

    public int saveUserCourseInfo(UserCourse userCourse);

    int findCourseByUserAndCourse(Integer userId, Integer courseId);

    public List<UserCourse> getCoursesByUserId(Integer userId);
}
