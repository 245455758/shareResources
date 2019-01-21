package com.trouble.shareresources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;

@RestController
@RequestMapping("/video")
@CrossOrigin(origins = "*",maxAge = 3600)
public class VideoController {

    @Autowired
    private HttpServletResponse response;

    /**
     * 视频流读取
     * @throws Exception
     */
    @RequestMapping(value = "/getVideo",method = RequestMethod.GET)
    @ResponseBody
    public void video( @RequestParam(name = "videoPath") String videoPath)throws Exception{
        //TODO ******视频地址的获取问题
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@"+videoPath);
        String videoPath1 = "";
        videoPath1 = videoPath.replaceAll("//", "/");
        System.out.println("#####################"+videoPath1);
        System.out.println(videoPath1);
//        videoPath = "C:/course_videos/test.mp4";
//        URL url = new URL(videoPath.replaceFirst("\"", "\"file:/").replaceAll("//", "/"));
//        System.out.println(url.toURI());
        File file = new File(videoPath1);
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
