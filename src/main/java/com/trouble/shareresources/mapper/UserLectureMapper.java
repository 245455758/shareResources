package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.UserLecture;
import com.trouble.shareresources.pojo.UserLectureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLectureMapper {
    int countByExample(UserLectureExample example);

    int deleteByExample(UserLectureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLecture record);

    int insertSelective(UserLecture record);

    List<UserLecture> selectByExample(UserLectureExample example);

    UserLecture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLecture record, @Param("example") UserLectureExample example);

    int updateByExample(@Param("record") UserLecture record, @Param("example") UserLectureExample example);

    int updateByPrimaryKeySelective(UserLecture record);

    int updateByPrimaryKey(UserLecture record);
}