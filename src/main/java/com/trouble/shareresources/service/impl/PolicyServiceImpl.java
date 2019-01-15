package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.entity.PolicySelectionEntity;
import com.trouble.shareresources.mapper.PolicyMapper;
import com.trouble.shareresources.pojo.Policy;
import com.trouble.shareresources.pojo.PolicyExample;
import com.trouble.shareresources.pojo.PropertyProtection;
import com.trouble.shareresources.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyMapper policyMapper;

    @Override
    public int getAllNum() {
        PolicyExample example = new PolicyExample();
        return policyMapper.countByExample(example);
    }

    @Override
    public List<Policy> getAllPolicySummary() {
        return policyMapper.selectPloicySummary();
    }

    @Override
    public Policy getPokicyById(Integer id) {
        return policyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int getNumWhenSelection(String title, String publisher, String fromDate, String toDate) {
        PolicySelectionEntity policySelectionEntity = new PolicySelectionEntity();
        if (title!=null && !"".equals(title)) policySelectionEntity.setTitle(title);
        if (publisher!=null && !"".equals(publisher)) policySelectionEntity.setPublisher(publisher);
        if (fromDate!=null && !"".equals(fromDate)) policySelectionEntity.setFromDate(fromDate);
        if (toDate!=null && !"".equals(toDate)) policySelectionEntity.setToDate(toDate);
        return policyMapper.countWhenSelection(policySelectionEntity);
    }

    @Override
    public List<PropertyProtection> getPolicysWhenSelection(String title, String publisher, String fromDate, String toDate) {
        PolicySelectionEntity policySelectionEntity = new PolicySelectionEntity();
        if (title!=null && !"".equals(title)) policySelectionEntity.setTitle(title);
        if (publisher!=null && !"".equals(publisher)) policySelectionEntity.setPublisher(publisher);
        if (fromDate!=null && !"".equals(fromDate)) policySelectionEntity.setFromDate(fromDate);
        if (toDate!=null && !"".equals(toDate)) policySelectionEntity.setToDate(toDate);
        return policyMapper.selectWhenSelection(policySelectionEntity);
    }
}
