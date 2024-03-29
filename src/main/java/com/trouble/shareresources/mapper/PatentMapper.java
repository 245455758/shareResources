package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.Patent;
import com.trouble.shareresources.pojo.PatentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatentMapper {
    int countByExample(PatentExample example);

    int deleteByExample(PatentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Patent record);

    int insertSelective(Patent record);

    List<Patent> selectByExampleWithBLOBs(PatentExample example);

    List<Patent> selectByExample(PatentExample example);

    List<Patent> getAllSummaryPatent();

    Patent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Patent record, @Param("example") PatentExample example);

    int updateByExampleWithBLOBs(@Param("record") Patent record, @Param("example") PatentExample example);

    int updateByExample(@Param("record") Patent record, @Param("example") PatentExample example);

    int updateByPrimaryKeySelective(Patent record);

    int updateByPrimaryKeyWithBLOBs(Patent record);

    int updateByPrimaryKey(Patent record);

    List<Patent> selectByCondition(Patent record);

    int countByCondition(Patent patent);
}