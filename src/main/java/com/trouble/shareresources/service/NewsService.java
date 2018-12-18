package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.News;

public interface NewsService {

    public News getDetailNews(Integer id);

    int saveDetailNews(Integer id);
}
