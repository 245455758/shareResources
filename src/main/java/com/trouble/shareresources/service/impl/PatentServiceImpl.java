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

        return patentMapper.countByCondition(patent);
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
        return patentMapper.selectByCondition(patent);
    }

    @Override
    public Patent getPatentById(Integer id) {
        return patentMapper.selectByPrimaryKey(id);
    }

}
