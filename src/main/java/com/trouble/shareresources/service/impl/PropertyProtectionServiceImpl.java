package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.PropertyProtectionMapper;
import com.trouble.shareresources.pojo.PropertyProtection;
import com.trouble.shareresources.pojo.PropertyProtectionExample;
import com.trouble.shareresources.entity.PropertyProtectionEntity;
import com.trouble.shareresources.service.PropertyProtectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyProtectionServiceImpl implements PropertyProtectionService {

    @Autowired
    private PropertyProtectionMapper propertyProtectionMapper;

    @Override
    public int getAllNum() {
        PropertyProtectionExample example = new PropertyProtectionExample();
        return propertyProtectionMapper.countByExample(example);
    }

    @Override
    public List<PropertyProtection> getSummaryPropertyProtections() {
        return propertyProtectionMapper.getSummaryInfo();
    }

    @Override
    public PropertyProtection getById(Integer id) {
        return propertyProtectionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int getNumWhenSelection(String title, String fromDate, String toDate) {
        return propertyProtectionMapper.selectCountWhenSelection(title,fromDate,toDate);
    }

    @Override
    public List<PropertyProtection> getPropertyProtectionsWhenSelection(String title, String fromDate, String toDate) {
        System.out.println("进入条件查询！！！！！！！！！！！！！！！！！！");
        PropertyProtectionEntity propertyProtectionEntity = new PropertyProtectionEntity();
        if(title!=null && !"".equals(title)) propertyProtectionEntity.setTitle(title);
        if(fromDate!=null&&!"".equals(fromDate)) propertyProtectionEntity.setFromDate(fromDate);
        if (toDate!=null&&!"".equals(toDate)) propertyProtectionEntity.setToDate(toDate);
        System.out.println(propertyProtectionEntity);
        return propertyProtectionMapper.selectPropertyProtectionWhenSelectByCondition(propertyProtectionEntity);
    }

}
