package com.trouble.shareresources.controller;

import com.trouble.shareresources.entity.ResultType;
import com.trouble.shareresources.util.PhotoUtil;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/test")
    @ResponseBody
    public ResultType testIn(){
        return new ResultType(true,"进入成功");
    }


    @RequestMapping(value = "/uploadPic",method = RequestMethod.POST)
    @ResponseBody
    public ResultType upload(Model model,
                             @RequestParam("myFile") MultipartFile file
            , HttpServletRequest request){
        System.out.println("进入Filesave");
        try{
            //TODO 文件存储路径的问题
            String path = PhotoUtil.saveFile(file,request);
            return new ResultType(true,path);
        }catch(Exception e){
            return new ResultType(false,"保存图片失败");
        }


    }
}
