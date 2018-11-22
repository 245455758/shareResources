package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.DeviceCategoryMapper;
import com.trouble.shareresources.pojo.DeviceCategory;
import com.trouble.shareresources.pojo.DeviceCategoryExample;
import com.trouble.shareresources.service.DeviceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceCategoryServiceImpl implements DeviceCategoryService{

    @Autowired
    private DeviceCategoryMapper deviceCategoryMapper;

    /**
     * 得到所有的种类
     * @return
     */
    @Override
    public List findAllCategory() {
        DeviceCategoryExample example = new DeviceCategoryExample();
        return deviceCategoryMapper.selectByExample(example);
    }
}
