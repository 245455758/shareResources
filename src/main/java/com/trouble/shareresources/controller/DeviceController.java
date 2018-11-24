package com.trouble.shareresources.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.trouble.shareresources.pojo.DeviceDetail;
import com.trouble.shareresources.service.DeviceOpenProjectService;
import com.trouble.shareresources.service.DeviceReservationService;
import com.trouble.shareresources.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/device")
public class DeviceController {
    //设备的服务
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private DeviceReservationService deviceReservationService;
    @Autowired
    private DeviceOpenProjectService deviceOpenProjectService;

    /**
     * 得到所有的设备信息
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public List getAllDevices(){
//        response.setHeader("Access-Control-Allow-Origin","*");
        return deviceService.findAllDevices();
    }

    /**
     * 根据得到的设备类别id，从而得到该设备类别下的所有设备
     * @param str
     * @return
     */
    @RequestMapping("/findByCategory")
    @ResponseBody
    public List getDevicesByCategory(@RequestBody String str){
        Object o=new Object();//8

        System.out.println(str);
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        return deviceService.findDevicesByCategoryId(id);
    }

    @RequestMapping("/findDetailById")
    @ResponseBody
    public Map getDeviceDetailById(@RequestBody String str){
        System.out.println(str);
        JSONObject jsonStr = JSON.parseObject(str);
        Integer id = jsonStr.getInteger("id");
        DeviceDetail deviceDetail = deviceService.findDeviceDetailById(id);
        List deviceReservations = deviceReservationService.findDeviceReservationByDeviceId(id);
        List openProjects = deviceOpenProjectService.findOpenProjectByDeviceId(id);
        Map map = new HashMap();
        map.put("deviceDetail", deviceDetail);
        map.put("deviceReservations", deviceReservations);
        map.put("openProjects", openProjects);
        return map;
    }


}
