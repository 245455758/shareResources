//package com.trouble.shareresources.config;
//
//import org.springframework.beans.factory.ListableBeanFactory;
//import org.springframework.beans.factory.ObjectProvider;
//import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
//import org.springframework.boot.autoconfigure.web.ResourceProperties;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//
//public class WebAppConfig extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {
//    public WebAppConfig(ResourceProperties resourceProperties, WebMvcProperties mvcProperties, ListableBeanFactory beanFactory, ObjectProvider<HttpMessageConverters> messageConvertersProvider, ObjectProvider<WebMvcAutoConfiguration.ResourceHandlerRegistrationCustomizer> resourceHandlerRegistrationCustomizerProvider) {
//        super(resourceProperties, mvcProperties, beanFactory, messageConvertersProvider, resourceHandlerRegistrationCustomizerProvider);
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //注册自定义拦截器，添加拦截路径和排除拦截路径
//        registry.addInterceptor(new InterceptorConfig()).addPathPatterns("/");
//    }
//
//
//}
