package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.AllianceMapper;
import com.trouble.shareresources.pojo.Alliance;
import com.trouble.shareresources.pojo.AllianceExample;
import com.trouble.shareresources.service.AllianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllianceServiceImpl implements AllianceService {

    @Autowired
    private AllianceMapper allianceMapper;

    @Override
    public int saveMemberInfo(Alliance alliance) {
        return allianceMapper.insert(alliance);
    }

    @Override
    public List<Alliance> getAllMemberInfo() {
        AllianceExample example = new AllianceExample();
        return allianceMapper.selectByExampleWithBLOBs(example);
    }
}
