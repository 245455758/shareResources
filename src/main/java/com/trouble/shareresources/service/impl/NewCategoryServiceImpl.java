package com.trouble.shareresources.service.impl;

import com.trouble.shareresources.mapper.NewsCategoryMapper;
import com.trouble.shareresources.pojo.NewsCategory;
import com.trouble.shareresources.pojo.NewsCategoryExample;
import com.trouble.shareresources.service.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewCategoryServiceImpl implements NewsCategoryService{

    @Autowired
    private NewsCategoryMapper newsCategoryMapper;


    @Override
    public List<NewsCategory> findAllCatrgory() {
        NewsCategoryExample example = new NewsCategoryExample();
        return newsCategoryMapper.selectByExample(example);
    }
}
