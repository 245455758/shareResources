package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.trouble.shareresources.pojo.BusinessGuidance;
import com.trouble.shareresources.service.BusinessGuidanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/businessGuidance")
@CrossOrigin(origins = "*",maxAge = 3600)
public class BusinessGuidanceController {

    @Autowired
    private BusinessGuidanceService businessGuidanceService;

    @RequestMapping("getAllGuidancesNum")
    @ResponseBody
    public int getGuidancesNum(){
        return businessGuidanceService.getGuidanceNum();
    }

    @RequestMapping("getAllGuidanceSummary")
    public List<BusinessGuidance> getAllGuidanceSummary(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer pageNo = jsonStr.getInteger("pageNo");
        Integer pageSize = jsonStr.getInteger("pageSize");
        PageHelper.startPage(pageNo, pageSize);
        return businessGuidanceService.getAllGuidanceSummary();
    }

    @RequestMapping("getBusinessGuidanceById")
    @ResponseBody
    public BusinessGuidance getBusinessGuidanceById(@RequestBody String str){
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        BusinessGuidance businessGuidenceById = businessGuidanceService.getBusinessGuidenceById(id);
        businessGuidenceById.setReadTimes(businessGuidenceById.getReadTimes()+1);
        businessGuidanceService.updateReadTimesById(businessGuidenceById);
        return businessGuidenceById;
    }

    @RequestMapping("getRecommendGuidances")
    @ResponseBody
    public List<BusinessGuidance> getRecommendGuidances(){
        return businessGuidanceService.getRecommendGuidance();
    }

}
