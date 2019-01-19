package com.trouble.shareresources.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
@RestController
@RequestMapping("/video")
@CrossOrigin(origins = "*",maxAge = 3600)
public class VideoController {

    /**
     * 视频流读取
     * @param response
     * @throws Exception
     */
    @RequestMapping("/getVideo")
    @ResponseBody
    public void video( HttpServletResponse response)throws Exception{
        File file = new File("C:\\course_videos\\test.mp4");
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
