package com.trouble.shareresources.controller;

import com.trouble.shareresources.pojo.DeviceCategory;
import com.trouble.shareresources.service.DeviceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("deviceCategory")
public class DeviceCategoryController {

    @Autowired
    private DeviceCategoryService deviceCategoryService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List findAllCategory(){

        return deviceCategoryService.findAllCategory();
    }

}
