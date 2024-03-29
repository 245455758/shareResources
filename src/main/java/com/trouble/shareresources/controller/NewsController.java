package com.trouble.shareresources.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.entity.ResultType;
import com.trouble.shareresources.pojo.News;
import com.trouble.shareresources.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/news")
@CrossOrigin(origins = "*",maxAge = 3600)
public class NewsController {

//    @Autowired
//    private NewsSummaryService newsSummaryService;
    @Autowired
    private NewsService newsService;

    //TODO 不知道哪里调用了
    @RequestMapping("getAllSummary")
    @ResponseBody
    public List<News> getAllNewsSummary(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        List<News> news = newsService.getAllSummaryNews(jsonStr.getString("date"));
        for (News oneNews:news) {
            oneNews.setStatus(oneNews.getId());
        }
        return news;
    }

    @RequestMapping("getDetailNews")
    @ResponseBody
    public News getDetailNews(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        News detailNews = newsService.getDetailNews(id);
        detailNews.setReadtimes(detailNews.getReadtimes()+1);
        newsService.saveDetailNews(detailNews.getId());
        return newsService.getDetailNews(id);
    }

    @RequestMapping("saveNews")
    @ResponseBody
    public ResultType saveNews(@RequestBody String str){
        System.out.println("进入saveNews");
        JSONObject jsonStr = JSON.parseObject(str);
        String title = jsonStr.getString("title");
        String content = jsonStr.getString("content");
        String publisher = jsonStr.getString("publisher");
        String pic = jsonStr.getString("pic");
        News news = new News(title,publisher,new Date(),0,0,"新闻",0,pic,"",content);
        int i = newsService.saveNews(news);
        if (i>0){
            return new ResultType(true,"保存成功");
        }else {
            return new ResultType(false,"保存失败");
        }
    }

    @RequestMapping("getNewsByCategory")
    @ResponseBody
    public List<News> getNewsByCategory(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        return newsService.findNewsByCategory(jsonStr.getString("id"));
    }



}
