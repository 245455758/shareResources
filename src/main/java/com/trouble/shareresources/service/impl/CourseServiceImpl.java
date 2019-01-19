package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.CourseMapper;
import com.trouble.shareresources.pojo.Course;
import com.trouble.shareresources.pojo.CourseExample;
import com.trouble.shareresources.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public int getAllCoursesNum() {
        CourseExample example = new CourseExample();
        return courseMapper.countByExample(example);
    }

    @Override
    public List<Course> getCoursesSummary() {
        return courseMapper.selectSummaryInfo();
    }

    @Override
    public List<Course> getRecommendCoursesSummary() {
        return courseMapper.selectRecommendSummary();
    }

    @Override
    public Course getCourseById(Integer id) {
        return courseMapper.selectByPrimaryKey(id);
    }
}
