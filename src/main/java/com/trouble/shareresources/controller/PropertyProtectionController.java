package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.trouble.shareresources.pojo.PropertyProtection;
import com.trouble.shareresources.service.PropertyProtectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propertyProtection")
@CrossOrigin(origins = "*",maxAge = 3600)
public class PropertyProtectionController {

    @Autowired
    private PropertyProtectionService propertyProtectionService;

    @RequestMapping("getAllNum")
    @ResponseBody
    public int getAllPropertyProtectionNum(){
        return propertyProtectionService.getAllNum();
    }

    @RequestMapping("/getPropertyProtections")
    @ResponseBody
    public List<PropertyProtection> getPropertyProtections(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        System.out.println("pageNo:"+pageNo+":pageSize:"+pageSize);
        PageHelper.startPage(pageNo, pageSize);
        return propertyProtectionService.getSummaryPropertyProtections();
    }

    @RequestMapping("/getPropertyProtectionById")
    @ResponseBody
    public PropertyProtection getPropertyProtectionById(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        return propertyProtectionService.getById(id);
    }

    @RequestMapping("/getNumWhenSelection")
    @ResponseBody
    public int getNumWhenSelection(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String title = jsonStr.getString("title");
        String fromDate = jsonStr.getString("fromDate");
        String toDate = jsonStr.getString("toDate");
        return propertyProtectionService.getNumWhenSelection(title,fromDate,toDate);
    }

    @RequestMapping("/getPropertyProtectionsWhenSelection")
    @ResponseBody
    public List<PropertyProtection> getPropertyProtectionsWhenSelection(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String title = jsonStr.getString("title");
        String fromDate = jsonStr.getString("fromDate");
        String toDate = jsonStr.getString("toDate");
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        PageHelper.startPage(pageNo, pageSize);
        return propertyProtectionService.getPropertyProtectionsWhenSelection(title,fromDate,toDate);
    }

}
