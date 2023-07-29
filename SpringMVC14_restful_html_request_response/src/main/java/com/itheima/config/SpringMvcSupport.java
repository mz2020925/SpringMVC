package com.itheima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 当想要访问html文件，例如/pages/books.html的时候，不要走SpringMVC中的控制器(controller)目录里面的Mapping路径，走webapp目录下/pages路径
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        // 同理
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");


    }
}
