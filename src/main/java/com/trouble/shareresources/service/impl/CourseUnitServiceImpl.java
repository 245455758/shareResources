package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.CourseUnitMapper;
import com.trouble.shareresources.pojo.CourseUnit;
import com.trouble.shareresources.pojo.CourseUnitExample;
import com.trouble.shareresources.service.CourseUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseUnitServiceImpl implements CourseUnitService {

    @Autowired
    private CourseUnitMapper courseUnitMapper;

    @Override
    public List<CourseUnit> getUnitsByCourseId(Integer id) {
        CourseUnitExample example = new CourseUnitExample();
        CourseUnitExample.Criteria criteria = example.createCriteria();
        criteria.andCourseIdEqualTo(id);
        return courseUnitMapper.selectByExample(example);
    }
}
