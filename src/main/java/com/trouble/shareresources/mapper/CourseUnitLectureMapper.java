package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.CourseUnitLecture;
import com.trouble.shareresources.pojo.CourseUnitLectureExample;
import com.trouble.shareresources.pojo.CourseUnitLectureKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseUnitLectureMapper {
    int countByExample(CourseUnitLectureExample example);

    int deleteByExample(CourseUnitLectureExample example);

    int deleteByPrimaryKey(CourseUnitLectureKey key);

    int insert(CourseUnitLecture record);

    int insertSelective(CourseUnitLecture record);

    List<CourseUnitLecture> selectByExample(CourseUnitLectureExample example);

    CourseUnitLecture selectByPrimaryKey(CourseUnitLectureKey key);

    int updateByExampleSelective(@Param("record") CourseUnitLecture record, @Param("example") CourseUnitLectureExample example);

    int updateByExample(@Param("record") CourseUnitLecture record, @Param("example") CourseUnitLectureExample example);

    int updateByPrimaryKeySelective(CourseUnitLecture record);

    int updateByPrimaryKey(CourseUnitLecture record);
}