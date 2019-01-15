package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.trouble.shareresources.pojo.Policy;
import com.trouble.shareresources.pojo.PropertyProtection;
import com.trouble.shareresources.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policy")
@CrossOrigin(origins = "*",maxAge = 3600)
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @RequestMapping("getAllPolicySummary")
    @ResponseBody
    public List<Policy> getAllPolicySummary(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        System.out.println("pageNo:"+pageNo+":pageSize:"+pageSize);
        PageHelper.startPage(pageNo, pageSize);
        return policyService.getAllPolicySummary();
    }

    @RequestMapping("/getAllPolicysNum")
    @ResponseBody
    public int getAllPolicyNum(){
        return policyService.getAllNum();
    }

    @RequestMapping("getPolicyById")
    @ResponseBody
    public Policy getPolicyById(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        return policyService.getPokicyById(id);
    }

    @RequestMapping("getNumWhenSelection")
    @ResponseBody
    public int getNumWhenSelection(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String title = jsonStr.getString("title");
        String publisher = jsonStr.getString("publisher");
        String fromDate = jsonStr.getString("fromDate");
        String toDate = jsonStr.getString("toDate");
        return policyService.getNumWhenSelection(title,publisher,fromDate,toDate);
    }

    @RequestMapping("/getPolicysWhenSelection")
    @ResponseBody
    public List<PropertyProtection> getPropertyProtectionsWhenSelection(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        String title = jsonStr.getString("title");
        String fromDate = jsonStr.getString("fromDate");
        String publisher = jsonStr.getString("publisher");
        String toDate = jsonStr.getString("toDate");
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        PageHelper.startPage(pageNo, pageSize);
        return policyService.getPolicysWhenSelection(title,publisher,fromDate,toDate);
    }
}
