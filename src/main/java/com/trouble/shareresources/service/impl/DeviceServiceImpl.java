package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.DeviceDetailMapper;
import com.trouble.shareresources.mapper.DeviceMapper;
import com.trouble.shareresources.pojo.Device;
import com.trouble.shareresources.pojo.DeviceDetail;
import com.trouble.shareresources.pojo.DeviceExample;
import com.trouble.shareresources.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    @Autowired
    private DeviceDetailMapper deviceDetailMapper;

    @Override
    public List<Device> findAllDevices() {
        DeviceExample example = new DeviceExample();
        return deviceMapper.selectByExample(example);
    }

    @Override
    public List<Device> findDevicesByCategoryId(Integer id) {
        DeviceExample example = new DeviceExample();
        DeviceExample.Criteria criteria = example.createCriteria();
        criteria.andCatalogueEqualTo(id.toString());
        return deviceMapper.selectByExample(example);
    }

    @Override
    public Device findDeviceByDeviceId(Integer id) {
        return deviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public DeviceDetail findDeviceDetailById(Integer id) {
        return deviceDetailMapper.selectByPrimaryKey(id);
    }
}
