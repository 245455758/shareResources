package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.DeviceCategory;
import com.trouble.shareresources.pojo.DeviceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceCategoryMapper {
    int countByExample(DeviceCategoryExample example);

    int deleteByExample(DeviceCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceCategory record);

    int insertSelective(DeviceCategory record);

    List<DeviceCategory> selectByExample(DeviceCategoryExample example);

    DeviceCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceCategory record, @Param("example") DeviceCategoryExample example);

    int updateByExample(@Param("record") DeviceCategory record, @Param("example") DeviceCategoryExample example);

    int updateByPrimaryKeySelective(DeviceCategory record);

    int updateByPrimaryKey(DeviceCategory record);
}