package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.DeviceReservationRecord;

import java.util.List;

public interface DeviceReservationService {
    /**
     * 根据设备账号查找对应的设备预约记录
     * @return
     */
    public List findDeviceReservationByDeviceId(Integer id);

}
