package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.UserCourse;

public interface UserCourseService {

    public int saveUserCourseInfo(UserCourse userCourse);

    int findCourseByUserAndCourse(Integer userId, Integer courseId);
}
