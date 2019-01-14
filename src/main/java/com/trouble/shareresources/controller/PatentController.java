package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.trouble.shareresources.pojo.Patent;
import com.trouble.shareresources.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patent")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PatentController {

    @Autowired
    private PatentService patentService;

    @RequestMapping("getAllSummaryPatent")
    @ResponseBody
    public List<Patent> getAllSummaryPatent(@RequestBody String str) {
        JSONObject jsonStr = JSON.parseObject(str);
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        PageHelper.startPage(pageNo, pageSize);
        return patentService.getAllSummaryPatent();
    }
    @RequestMapping("getAllPatentCount")
    @ResponseBody
    public int getAllPatentCount(){
        return patentService.getPatentCount();
    }

    @RequestMapping("selectPatentsByCondition")
    @ResponseBody
    public List<Patent> selectPatentsByCondition(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String name = jsonStr.getString("name");
        String patentNo = jsonStr.getString("patentNo");
        String patenType = jsonStr.getString("patent_type");
        String field = jsonStr.getString("field");
        System.out.println(patenType+","+field);
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        PageHelper.startPage(pageNo, pageSize);
        List<Patent> patentByCondition = patentService.getPatentByCondition(name, patentNo, patenType, field);
        System.out.println(patentByCondition);
        return patentByCondition;
    }
    @RequestMapping("getPatentCountWhenSelect")
    @ResponseBody
    public int getPatentCountWhenSelect(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String name = jsonStr.getString("name");
        String patentNo = jsonStr.getString("patentNo");
        String patenType = jsonStr.getString("patent_type");
        String field = jsonStr.getString("field");
        return patentService.getPatentCountWhenSelect(name, patentNo, patenType, field);
    }
    @RequestMapping("getPatentById")
    @ResponseBody
    public Patent getPatentById(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        return patentService.getPatentById(id);
    }

}
