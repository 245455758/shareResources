package com.trouble.shareresources.mapper;

import com.trouble.shareresources.entity.PolicySelectionEntity;
import com.trouble.shareresources.pojo.Policy;
import com.trouble.shareresources.pojo.PolicyExample;
import com.trouble.shareresources.pojo.PropertyProtection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PolicyMapper {
    int countByExample(PolicyExample example);

    int deleteByExample(PolicyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Policy record);

    int insertSelective(Policy record);

    List<Policy> selectByExampleWithBLOBs(PolicyExample example);

    List<Policy> selectByExample(PolicyExample example);

    Policy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Policy record, @Param("example") PolicyExample example);

    int updateByExampleWithBLOBs(@Param("record") Policy record, @Param("example") PolicyExample example);

    int updateByExample(@Param("record") Policy record, @Param("example") PolicyExample example);

    int updateByPrimaryKeySelective(Policy record);

    int updateByPrimaryKeyWithBLOBs(Policy record);

    int updateByPrimaryKey(Policy record);

    List<Policy> selectPloicySummary();

    int countWhenSelection(PolicySelectionEntity policySelectionEntity);

    List<PropertyProtection> selectWhenSelection(PolicySelectionEntity policySelectionEntity);
}