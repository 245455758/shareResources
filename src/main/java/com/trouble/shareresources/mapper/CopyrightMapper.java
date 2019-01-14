package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.Copyright;
import com.trouble.shareresources.pojo.CopyrightExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CopyrightMapper {
    int countByExample(CopyrightExample example);

    int deleteByExample(CopyrightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Copyright record);

    int insertSelective(Copyright record);

    List<Copyright> selectByExample(CopyrightExample example);

    List<Copyright> selectSummaries();

    Copyright selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Copyright record, @Param("example") CopyrightExample example);

    int updateByExample(@Param("record") Copyright record, @Param("example") CopyrightExample example);

    int updateByPrimaryKeySelective(Copyright record);

    int updateByPrimaryKey(Copyright record);

    int selectCountWhenSelection(Copyright copyright);

    List<Copyright> getCopyrightsWhenSelection(Copyright copyright);
}