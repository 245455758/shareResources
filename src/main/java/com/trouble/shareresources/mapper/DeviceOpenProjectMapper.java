package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.DeviceOpenProject;
import com.trouble.shareresources.pojo.DeviceOpenProjectExample;
import com.trouble.shareresources.pojo.DeviceOpenProjectWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceOpenProjectMapper {
    int countByExample(DeviceOpenProjectExample example);

    int deleteByExample(DeviceOpenProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceOpenProjectWithBLOBs record);

    int insertSelective(DeviceOpenProjectWithBLOBs record);

    List<DeviceOpenProjectWithBLOBs> selectByExampleWithBLOBs(DeviceOpenProjectExample example);

    List<DeviceOpenProject> selectByExample(DeviceOpenProjectExample example);

    DeviceOpenProjectWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceOpenProjectWithBLOBs record, @Param("example") DeviceOpenProjectExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceOpenProjectWithBLOBs record, @Param("example") DeviceOpenProjectExample example);

    int updateByExample(@Param("record") DeviceOpenProject record, @Param("example") DeviceOpenProjectExample example);

    int updateByPrimaryKeySelective(DeviceOpenProjectWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DeviceOpenProjectWithBLOBs record);

    int updateByPrimaryKey(DeviceOpenProject record);
}