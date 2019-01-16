package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.BusinessGuidanceMapper;
import com.trouble.shareresources.pojo.BusinessGuidance;
import com.trouble.shareresources.pojo.BusinessGuidanceExample;
import com.trouble.shareresources.service.BusinessGuidanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessGuidanceServiceImpl implements BusinessGuidanceService {

    @Autowired
    private BusinessGuidanceMapper businessGuidanceMapper;

    @Override
    public int getGuidanceNum() {
        BusinessGuidanceExample example = new BusinessGuidanceExample();
        return businessGuidanceMapper.countByExample(example);
    }

    @Override
    public List<BusinessGuidance> getAllGuidanceSummary() {
        BusinessGuidanceExample example = new BusinessGuidanceExample();
        return businessGuidanceMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public BusinessGuidance getBusinessGuidenceById(Integer id) {
        return businessGuidanceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateReadTimesById(BusinessGuidance businessGuidenceById) {
        return businessGuidanceMapper.updateByPrimaryKey(businessGuidenceById);
    }

    @Override
    public List<BusinessGuidance> getRecommendGuidance() {
        BusinessGuidanceExample example = new BusinessGuidanceExample();
        BusinessGuidanceExample.Criteria criteria = example.createCriteria();
        criteria.andIsrecommendEqualTo(true);
        return businessGuidanceMapper.selectByExampleWithBLOBs(example);
    }
}
