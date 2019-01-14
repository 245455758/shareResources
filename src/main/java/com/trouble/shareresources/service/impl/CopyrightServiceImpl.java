package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.CopyrightMapper;
import com.trouble.shareresources.pojo.Copyright;
import com.trouble.shareresources.pojo.CopyrightExample;
import com.trouble.shareresources.service.CopyrightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CopyrightServiceImpl implements CopyrightService {

    @Autowired
    private CopyrightMapper copyrightMapper;

    @Override
    public List<Copyright> getAllSummary() {
        return copyrightMapper.selectSummaries();
    }

    @Override
    public int getAllNum() {
        CopyrightExample example = new CopyrightExample();
        return copyrightMapper.countByExample(example);
    }

    @Override
    public Copyright getById(Integer id) {
        return copyrightMapper.selectByPrimaryKey(id);
    }

    @Override
    public int getCountWhenSelection(String category, String name, String number) {
        Copyright copyright = new Copyright();
        if (category != null && !"".equals(category)) {
            copyright.setCategory(category);
        }
        if (name != null && !"".equals(name)){
            copyright.setName(name);
        }
        if (number != null && !"".equals(number)){
            copyright.setNumber(number);
        }
        return copyrightMapper.selectCountWhenSelection(copyright);
    }

    @Override
    public List<Copyright> getCopyrightsWhenSelection(String category, String name, String number) {
        Copyright copyright = new Copyright();
        if (category != null && !"".equals(category)) {
            copyright.setCategory(category);
        }
        if (name != null && !"".equals(name)){
            copyright.setName(name);
        }
        if (number != null && !"".equals(number)){
            copyright.setNumber(number);
        }
        return copyrightMapper.getCopyrightsWhenSelection(copyright);
    }
}
