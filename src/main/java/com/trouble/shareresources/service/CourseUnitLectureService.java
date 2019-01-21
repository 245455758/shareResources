package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.CourseUnitLecture;

import java.util.List;

public interface CourseUnitLectureService {

    public List<CourseUnitLecture> getUnitLecturesByUnitId(Integer id);

}
