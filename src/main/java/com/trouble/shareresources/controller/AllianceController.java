package com.trouble.shareresources.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.entity.ResultType;
import com.trouble.shareresources.pojo.Alliance;
import com.trouble.shareresources.service.AllianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alliance")
@CrossOrigin(origins = "*",maxAge = 3600)
public class AllianceController {

    @Autowired
    private AllianceService allianceService;

    @RequestMapping("/saveMemberInfo")
    @ResponseBody
    public ResultType saveAllianceMemberInfo(@RequestBody String str){
//        JsonObject jsonStr = JSON.parse(str);
        JSONObject jsonStr = JSON.parseObject(str);
        Alliance alliance = new Alliance();
        alliance.setName(jsonStr.getString("name"));
        alliance.setIntroduction(jsonStr.getString("introduction"));
        alliance.setPic(jsonStr.getString("pic"));
        int i = allianceService.saveMemberInfo(alliance);
        if (i>0) return new ResultType(true,"新增成功");
        else return  new ResultType(false,"增加失败");
    }

    @RequestMapping("getAllMemberInfo")
    @ResponseBody
    public List<Alliance> getAllMemberInfo(){
        try{
            return allianceService.getAllMemberInfo();
        }catch(Exception e){
            return null;
        }
    }
}
