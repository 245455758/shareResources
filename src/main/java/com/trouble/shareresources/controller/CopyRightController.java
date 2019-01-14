package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.trouble.shareresources.pojo.Copyright;
import com.trouble.shareresources.service.CopyrightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/copyright")
@CrossOrigin(origins = "*",maxAge = 3600)
public class CopyRightController {

    @Autowired
    private CopyrightService copyrightService;

    @RequestMapping("getAllCopyrightsSummary")
    @ResponseBody
    public List<Copyright> getAllCopyrightsSummary(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        System.out.println("pageNo:"+pageNo+":pageSize:"+pageSize);
        PageHelper.startPage(pageNo, pageSize);
        return copyrightService.getAllSummary();
    }

    @RequestMapping("/getAllCopyrightsNum")
    @ResponseBody
    public int getAllCopyrightsNum(){
        return copyrightService.getAllNum();
    }

    @RequestMapping("/getCopyRightById")
    @ResponseBody
    public Copyright getCopyRightById(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        return copyrightService.getById(id);
    }

    @RequestMapping("/getNumWhenSelection")
    @ResponseBody
    public int getNumWhenSelection(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String category = jsonStr.getString("category");
        String name = jsonStr.getString("name");
        String number = jsonStr.getString("number");
        return copyrightService.getCountWhenSelection(category,name,number);
    }

    @RequestMapping("/getCopyrightsWhenSelection")
    @ResponseBody
    public List<Copyright> getCopyrightsWhenSelection(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String category = jsonStr.getString("category");
        String name = jsonStr.getString("name");
        String number = jsonStr.getString("number");
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        PageHelper.startPage(pageNo, pageSize);
        return copyrightService.getCopyrightsWhenSelection(category,name,number);
    }

}
