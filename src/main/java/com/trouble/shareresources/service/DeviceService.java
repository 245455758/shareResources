package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.Device;
import com.trouble.shareresources.pojo.DeviceDetail;

import java.util.List;

public interface DeviceService {
    /**
     * 得到所有的设备
     * @return
     */
    public List<Device> findAllDevices();

    /**
     * 通过类别id，得到所有该类别的设备
     * @param id
     * @return
     */
    public List<Device> findDevicesByCategoryId(Integer id);

    /**
     * 根据设备id查找设备
     * @param id
     * @return
     */
    Device findDeviceByDeviceId(Integer id);
    /**
     * 根据设备i的查找设备的详细信息
     * @param id
     * @return
     */
    public DeviceDetail findDeviceDetailById(Integer id);

}
