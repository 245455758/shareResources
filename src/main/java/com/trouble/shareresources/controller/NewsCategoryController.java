package com.trouble.shareresources.controller;

import com.trouble.shareresources.pojo.NewsCategory;
import com.trouble.shareresources.service.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/newsCategory")
@CrossOrigin(origins = "*",maxAge = 3600)
public class NewsCategoryController {

    @Autowired
    private NewsCategoryService newsCategoryService;

    @RequestMapping("/getAllCategory")
    @ResponseBody
    public List<NewsCategory> getAllCategory(){
        return newsCategoryService.findAllCatrgory();
    }

}
