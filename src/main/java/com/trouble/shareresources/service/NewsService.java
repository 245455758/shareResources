package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.News;

import java.util.List;

public interface NewsService {

    public News getDetailNews(Integer id);

    int saveDetailNews(Integer id);

    int saveNews(News news);

    List<News> getAllNews();

    List<News> findNewsByCategory(String category);

}
