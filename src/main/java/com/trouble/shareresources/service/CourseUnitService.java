package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.CourseUnit;

import java.util.List;

public interface CourseUnitService {

    public List<CourseUnit> getUnitsByCourseId(Integer id);

}
