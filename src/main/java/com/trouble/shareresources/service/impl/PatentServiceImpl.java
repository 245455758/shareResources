package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.PatentMapper;
import com.trouble.shareresources.pojo.Patent;
import com.trouble.shareresources.pojo.PatentExample;
import com.trouble.shareresources.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatentServiceImpl implements PatentService {

    @Autowired
    private PatentMapper patentMapper;

    @Override
    public List<Patent> getAllSummaryPatent() {
        return patentMapper.getAllSummaryPatent();
    }

    @Override
    public int getPatentCount() {
        PatentExample example = new PatentExample();
        return patentMapper.countByExample(example);
    }

    @Override
    public int getPatentCountWhenSelect(String name, String patentNo, String patenType, String field) {
        PatentExample example = new PatentExample();
        PatentExample.Criteria criteria = example.createCriteria();
        if(field!=null) criteria.andFieldEqualTo(field);
        if(name!=null) criteria.andNameLike(name);
        if(patentNo!=null) criteria.andPatentNoLike(patentNo);
        if(patenType!=null) criteria.andPatentTypeEqualTo(patenType);
        return patentMapper.countByExample(example);
    }

    @Override
    public List<Patent> getPatentByCondition(String name, String patentNo, String patenType, String field) {
        Patent patent = new Patent();
        if(field!=null&&!"".equals(field)) {
            patent.setField(field.trim());
        }
        if(name!=null&&!"".equals(name)){
            patent.setName(name);
        }
        if(patentNo!=null&&!"".equals(patentNo)){
            patent.setPatentNo(patentNo);
        }
        if(patenType!=null&&!"".equals(patenType)){
            patent.setPatentType(patenType);
        }
//        LogFactory.useLog4JLogging();
        return patentMapper.selectByCondition(patent);
    }

}
