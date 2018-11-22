package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.DeviceReservationRecordMapper;
import com.trouble.shareresources.pojo.DeviceReservationRecord;
import com.trouble.shareresources.pojo.DeviceReservationRecordExample;
import com.trouble.shareresources.service.DeviceReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceReservationServiceImpl implements DeviceReservationService {

    @Autowired
    private DeviceReservationRecordMapper deviceReservationRecordMapper;

    @Override
    public List findDeviceReservationByDeviceId(Integer id) {
        DeviceReservationRecordExample example = new DeviceReservationRecordExample();
        DeviceReservationRecordExample.Criteria criteria = example.createCriteria();
        criteria.andDeviceIdEqualTo(id);
        return deviceReservationRecordMapper.selectByExample(example);
    }
}
