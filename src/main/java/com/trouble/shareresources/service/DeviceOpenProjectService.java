package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.DeviceOpenProject;

import java.util.List;

public interface DeviceOpenProjectService {
    /**
     * 根据设备id查找设备开放项目
     * @param id
     * @return
     */
    public List findOpenProjectByDeviceId(Integer id);

}
