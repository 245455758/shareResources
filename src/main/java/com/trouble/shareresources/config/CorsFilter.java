//package com.trouble.shareresources.config;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebFilter(urlPatterns = "/deviceCategory/*")
//public class CorsFilter implements HandlerInterceptor {
//
////    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
////        HttpServletResponse response = (HttpServletResponse) res;
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
////        chain.doFilter(req, res);
////
////    }
//
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
////        HttpServletResponse response = (HttpServletResponse) res;
////        HttpServletRequest request = (HttpServletRequest) req;
//        System.out.println("进入过滤器.的完成请求...");
////         response.setHeader("Access-Control-Allow-Origin",reqs.getHeader("Origin"));
////        response.setHeader("Access-Control-Allow-Origin", "*");
//
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Headers", "Authorization,Origin, X-Requested-With, Content-Type, Accept");
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PATCH, DELETE, PUT");
////        response.setHeader("Access-Control-Allow-Credentials", "true");
////        response.setHeader("Access-Control-Max-Age", "3600");
////        response.setHeader("X-Powered-By", "3.2.1");
////        response.setHeader("content-type", "application/json; charset=utf-8");
////        response.setHeader("Access-Control-Allow-Headers", "Authentication");
////
////        chain.doFilter(req, res);
//    }
//}
