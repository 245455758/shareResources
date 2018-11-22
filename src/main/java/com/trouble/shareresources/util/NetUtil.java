package com.trouble.shareresources.util;

import javax.servlet.http.HttpServletResponse;

public class NetUtil {


    public static void setResponseHeader(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
    }


}
