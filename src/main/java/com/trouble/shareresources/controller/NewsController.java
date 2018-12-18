package com.trouble.shareresources.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.pojo.News;
import com.trouble.shareresources.pojo.NewsSummary;
import com.trouble.shareresources.service.NewsService;
import com.trouble.shareresources.service.NewsSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsSummaryService newsSummaryService;
    @Autowired
    private NewsService newsService;

    @RequestMapping("getAllSummary")
    @ResponseBody
    public List<NewsSummary> getAllNewsSummary(){
        return newsSummaryService.getAllNewsSummary();
    }

    @RequestMapping("getDetailNews")
    @ResponseBody
    public News getDetailNews(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        return newsService.getDetailNews(id);
    }


}
