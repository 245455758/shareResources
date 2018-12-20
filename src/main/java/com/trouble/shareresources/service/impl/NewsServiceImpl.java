package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.NewsMapper;
import com.trouble.shareresources.pojo.News;
import com.trouble.shareresources.pojo.NewsExample;
import com.trouble.shareresources.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News getDetailNews(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveDetailNews(Integer id) {
        return newsMapper.updateReadTimes(id);
    }

    @Override
    public int saveNews(News news) {
        return newsMapper.insertSelective(news);
    }

    @Override
    public List<News> getAllNews() {
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        return newsMapper.selectByExample(example);
    }
}
