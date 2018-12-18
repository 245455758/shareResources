package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.NewsSummaryMapper;
import com.trouble.shareresources.pojo.NewsSummary;
import com.trouble.shareresources.pojo.NewsSummaryExample;
import com.trouble.shareresources.service.NewsSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsSummaryServiceImpl implements NewsSummaryService {

    @Autowired
    private NewsSummaryMapper newsSummaryMapper;

    @Override
    public List<NewsSummary> getAllNewsSummary() {
        NewsSummaryExample example = new NewsSummaryExample();
        NewsSummaryExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        return newsSummaryMapper.selectByExampleWithBLOBs(example);
    }
}
