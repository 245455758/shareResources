//package com.trouble.shareresources.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.PrintWriter;
//
//public class InterceptorConfig  implements HandlerInterceptor {
//
//    private static final Logger log = LoggerFactory.getLogger(InterceptorConfig.class);
//
//    /**
//     * 进入controller层之前拦截请求
//     * @param httpServletRequest
//     * @param httpServletResponse
//     * @param o
//     * @return
//     * @throws Exception
//     */
//    @Override
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//
//        log.info("---------------------开始进入请求地址拦截----------------------------");
////        HttpSession session = httpServletRequest.getSession();
////        if(!StringUtils.isEmpty(session.getAttribute("userName"))){
////            return true;
////        }
////        else{
////            PrintWriter printWriter = httpServletResponse.getWriter();
////            printWriter.write("{code:0,message:\"session is invalid,please login again!\"}");
////            return false;
////        }
//
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//        log.info("--------------处理请求完成后视图渲染之前的处理操作---------------");
//        HttpServletResponse response = (HttpServletResponse) httpServletResponse;
////        HttpServletRequest request = (HttpServletRequest) req;
////        System.out.println("进入过滤器....");
//////         response.setHeader("Access-Control-Allow-Origin",reqs.getHeader("Origin"));
//////        response.setHeader("Access-Control-Allow-Origin", "*");
////
////        response.setHeader("Access-Control-Allow-Origin", "*");
////        response.setHeader("Access-Control-Allow-Headers", "Authorization,Origin, X-Requested-With, Content-Type, Accept");
////        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PATCH, DELETE, PUT");
//////        response.setHeader("Access-Control-Allow-Credentials", "true");
//////        response.setHeader("Access-Control-Max-Age", "3600");
//////        response.setHeader("X-Powered-By", "3.2.1");
//////        response.setHeader("content-type", "application/json; charset=utf-8");
//////        response.setHeader("Access-Control-Allow-Headers", "Authentication");
////
//        chain.doFilter(req, res);
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//        log.info("---------------视图渲染之后的操作-------------------------0");
//    }
//}
//
