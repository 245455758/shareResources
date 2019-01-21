package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.CourseUnitLectureMapper;
import com.trouble.shareresources.pojo.CourseUnitLecture;
import com.trouble.shareresources.pojo.CourseUnitLectureExample;
import com.trouble.shareresources.service.CourseUnitLectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseUnitLectureServiceImpl implements CourseUnitLectureService {

    @Autowired
    private CourseUnitLectureMapper courseUnitLectureMapper;

    @Override
    public List<CourseUnitLecture> getUnitLecturesByUnitId(Integer id) {
        CourseUnitLectureExample example = new CourseUnitLectureExample();
        CourseUnitLectureExample.Criteria criteria = example.createCriteria();
        criteria.andUnitIdEqualTo(id);
        return courseUnitLectureMapper.selectByExample(example);
    }
}
