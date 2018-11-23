package com.trouble.shareresources.controller;

import com.trouble.shareresources.service.DeviceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("deviceCategory")
//@CrossOrigin(origins="*",allowCredentials="true")
public class DeviceCategoryController {
    //种类服务类
    @Autowired
    private DeviceCategoryService deviceCategoryService;
//    @Autowired
//    private HttpServletResponse response;

    /**
     * 查找得到所有的种类
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public List findAllCategory(){
//        NetUtil.setResponseHeader(response);
        return deviceCategoryService.findAllCategory();
    }

}
