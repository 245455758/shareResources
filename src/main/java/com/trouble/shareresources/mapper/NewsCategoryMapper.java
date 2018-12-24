package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.NewsCategory;
import com.trouble.shareresources.pojo.NewsCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsCategoryMapper {
    int countByExample(NewsCategoryExample example);

    int deleteByExample(NewsCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsCategory record);

    int insertSelective(NewsCategory record);

    List<NewsCategory> selectByExample(NewsCategoryExample example);

    NewsCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsCategory record, @Param("example") NewsCategoryExample example);

    int updateByExample(@Param("record") NewsCategory record, @Param("example") NewsCategoryExample example);

    int updateByPrimaryKeySelective(NewsCategory record);

    int updateByPrimaryKey(NewsCategory record);
}