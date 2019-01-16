package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.BusinessGuidance;

import java.util.List;

public interface BusinessGuidanceService {

    int getGuidanceNum();

    List<BusinessGuidance> getAllGuidanceSummary();

    BusinessGuidance getBusinessGuidenceById(Integer id);

    int updateReadTimesById(BusinessGuidance businessGuidenceById);

    List<BusinessGuidance> getRecommendGuidance();
}
