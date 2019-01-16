package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.BusinessGuidance;
import com.trouble.shareresources.pojo.BusinessGuidanceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinessGuidanceMapper {
    int countByExample(BusinessGuidanceExample example);

    int deleteByExample(BusinessGuidanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessGuidance record);

    int insertSelective(BusinessGuidance record);

    List<BusinessGuidance> selectByExampleWithBLOBs(BusinessGuidanceExample example);

    List<BusinessGuidance> selectByExample(BusinessGuidanceExample example);

    BusinessGuidance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessGuidance record, @Param("example") BusinessGuidanceExample example);

    int updateByExampleWithBLOBs(@Param("record") BusinessGuidance record, @Param("example") BusinessGuidanceExample example);

    int updateByExample(@Param("record") BusinessGuidance record, @Param("example") BusinessGuidanceExample example);

    int updateByPrimaryKeySelective(BusinessGuidance record);

    int updateByPrimaryKeyWithBLOBs(BusinessGuidance record);

    int updateByPrimaryKey(BusinessGuidance record);
}