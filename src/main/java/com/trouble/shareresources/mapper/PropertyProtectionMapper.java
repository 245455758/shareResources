package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.PropertyProtectionExample;
import com.trouble.shareresources.pojo.PropertyProtection;
import com.trouble.shareresources.entity.PropertyProtectionEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyProtectionMapper {
    int countByExample(PropertyProtectionExample example);

    int deleteByExample(PropertyProtectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PropertyProtection record);

    int insertSelective(PropertyProtection record);

    List<PropertyProtection> selectByExample(PropertyProtectionExample example);

    PropertyProtection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PropertyProtection record, @Param("example") PropertyProtectionExample example);

    int updateByExample(@Param("record") PropertyProtection record, @Param("example") PropertyProtectionExample example);

    int updateByPrimaryKeySelective(PropertyProtection record);

    int updateByPrimaryKey(PropertyProtection record);

    List<PropertyProtection> getSummaryInfo();

    int selectCountWhenSelection(@Param("title") String title,@Param("fromDate") String fromDate,@Param("toDate") String toDate);

    List<PropertyProtection> selectPropertyProtectionWhenSelectByCondition(PropertyProtectionEntity propertyProtectionEntity);
}