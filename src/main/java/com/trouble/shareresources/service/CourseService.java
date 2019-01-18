package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.Course;

import java.util.List;

public interface CourseService {

    public int getAllCoursesNum();

    List<Course> getCoursesSummary();
}
