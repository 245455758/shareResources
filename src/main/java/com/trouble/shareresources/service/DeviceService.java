package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.Device;

import java.util.List;

public interface DeviceService {

    public List<Device> findAllDevices();

    public List<Device> findDevicesById(Integer id);

}
