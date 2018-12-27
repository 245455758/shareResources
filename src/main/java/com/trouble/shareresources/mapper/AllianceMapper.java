package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.Alliance;
import com.trouble.shareresources.pojo.AllianceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AllianceMapper {
    int countByExample(AllianceExample example);

    int deleteByExample(AllianceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Alliance record);

    int insertSelective(Alliance record);

    List<Alliance> selectByExampleWithBLOBs(AllianceExample example);

    List<Alliance> selectByExample(AllianceExample example);

    Alliance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Alliance record, @Param("example") AllianceExample example);

    int updateByExampleWithBLOBs(@Param("record") Alliance record, @Param("example") AllianceExample example);

    int updateByExample(@Param("record") Alliance record, @Param("example") AllianceExample example);

    int updateByPrimaryKeySelective(Alliance record);

    int updateByPrimaryKeyWithBLOBs(Alliance record);

    int updateByPrimaryKey(Alliance record);
}