package com.trouble.shareresources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;

@RestController
@RequestMapping("/file")
@CrossOrigin(origins = "*",maxAge = 3600)
public class FileController {

    @Autowired
    private HttpServletResponse response;

    /**
     * 文件流读取
     * @throws Exception
     */
    @RequestMapping(value = "/getFile",method = RequestMethod.GET)
    @ResponseBody
    public void video( @RequestParam(name = "filePath") String filePath)throws Exception{
//        videoPath1 = videoPath.replaceAll("//", "/");
        System.out.println(filePath);
        File file = new File(filePath);
        FileInputStream in = new FileInputStream(file);
        ServletOutputStream out = response.getOutputStream();
        byte[] b = null;
        while(in.available() >0) {
            if(in.available()>10240) {
                b = new byte[10240];
            }else {
                b = new byte[in.available()];
            }
            in.read(b, 0, b.length);
            out.write(b, 0, b.length);
        }
        in.close();
        out.flush();
        out.close();
    }
}
