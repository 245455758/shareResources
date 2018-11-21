package com.trouble.shareresources.mapper;

import com.trouble.shareresources.pojo.DeviceReservationRecord;
import com.trouble.shareresources.pojo.DeviceReservationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceReservationRecordMapper {
    int countByExample(DeviceReservationRecordExample example);

    int deleteByExample(DeviceReservationRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceReservationRecord record);

    int insertSelective(DeviceReservationRecord record);

    List<DeviceReservationRecord> selectByExample(DeviceReservationRecordExample example);

    DeviceReservationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceReservationRecord record, @Param("example") DeviceReservationRecordExample example);

    int updateByExample(@Param("record") DeviceReservationRecord record, @Param("example") DeviceReservationRecordExample example);

    int updateByPrimaryKeySelective(DeviceReservationRecord record);

    int updateByPrimaryKey(DeviceReservationRecord record);
}