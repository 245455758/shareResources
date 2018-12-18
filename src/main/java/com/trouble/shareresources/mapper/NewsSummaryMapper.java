package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.NewsSummary;
import com.trouble.shareresources.pojo.NewsSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsSummaryMapper {
    int countByExample(NewsSummaryExample example);

    int deleteByExample(NewsSummaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsSummary record);

    int insertSelective(NewsSummary record);

    List<NewsSummary> selectByExampleWithBLOBs(NewsSummaryExample example);

    List<NewsSummary> selectByExample(NewsSummaryExample example);

    NewsSummary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsSummary record, @Param("example") NewsSummaryExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsSummary record, @Param("example") NewsSummaryExample example);

    int updateByExample(@Param("record") NewsSummary record, @Param("example") NewsSummaryExample example);

    int updateByPrimaryKeySelective(NewsSummary record);

    int updateByPrimaryKeyWithBLOBs(NewsSummary record);

    int updateByPrimaryKey(NewsSummary record);
}