package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.DeviceOpenProjectMapper;
import com.trouble.shareresources.pojo.DeviceOpenProject;
import com.trouble.shareresources.pojo.DeviceOpenProjectExample;
import com.trouble.shareresources.service.DeviceOpenProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceOpenProjectServiceImpl implements DeviceOpenProjectService {

    @Autowired
    private DeviceOpenProjectMapper deviceOpenProjectMapper;

    @Override
    public List findOpenProjectByDeviceId(Integer id) {
        DeviceOpenProjectExample example = new DeviceOpenProjectExample();
        DeviceOpenProjectExample.Criteria criteria = example.createCriteria();
        criteria.andDeviceIdEqualTo(id);
        return deviceOpenProjectMapper.selectByExampleWithBLOBs(example);
    }
}
