package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.UserCourse;
import com.trouble.shareresources.pojo.UserCourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCourseMapper {
    int countByExample(UserCourseExample example);

    int deleteByExample(UserCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserCourse record);

    int insertSelective(UserCourse record);

    List<UserCourse> selectByExample(UserCourseExample example);

    UserCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserCourse record, @Param("example") UserCourseExample example);

    int updateByExample(@Param("record") UserCourse record, @Param("example") UserCourseExample example);

    int updateByPrimaryKeySelective(UserCourse record);

    int updateByPrimaryKey(UserCourse record);
}