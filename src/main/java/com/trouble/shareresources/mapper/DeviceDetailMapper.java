package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.DeviceDetail;
import com.trouble.shareresources.pojo.DeviceDetailExample;
import com.trouble.shareresources.pojo.DeviceDetailWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceDetailMapper {
    int countByExample(DeviceDetailExample example);

    int deleteByExample(DeviceDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceDetailWithBLOBs record);

    int insertSelective(DeviceDetailWithBLOBs record);

    List<DeviceDetailWithBLOBs> selectByExampleWithBLOBs(DeviceDetailExample example);

    List<DeviceDetail> selectByExample(DeviceDetailExample example);

    DeviceDetailWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceDetailWithBLOBs record, @Param("example") DeviceDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceDetailWithBLOBs record, @Param("example") DeviceDetailExample example);

    int updateByExample(@Param("record") DeviceDetail record, @Param("example") DeviceDetailExample example);

    int updateByPrimaryKeySelective(DeviceDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DeviceDetailWithBLOBs record);

    int updateByPrimaryKey(DeviceDetail record);
}