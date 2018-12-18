package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.NewsMapper;
import com.trouble.shareresources.pojo.News;
import com.trouble.shareresources.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News getDetailNews(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }
}
