package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.CourseUnit;
import com.trouble.shareresources.pojo.CourseUnitExample;
import com.trouble.shareresources.pojo.CourseUnitKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseUnitMapper {
    int countByExample(CourseUnitExample example);

    int deleteByExample(CourseUnitExample example);

    int deleteByPrimaryKey(CourseUnitKey key);

    int insert(CourseUnit record);

    int insertSelective(CourseUnit record);

    List<CourseUnit> selectByExample(CourseUnitExample example);

    CourseUnit selectByPrimaryKey(CourseUnitKey key);

    int updateByExampleSelective(@Param("record") CourseUnit record, @Param("example") CourseUnitExample example);

    int updateByExample(@Param("record") CourseUnit record, @Param("example") CourseUnitExample example);

    int updateByPrimaryKeySelective(CourseUnit record);

    int updateByPrimaryKey(CourseUnit record);
}