package com.itheima.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

// 4.定义一个Servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    // 这里的方式更加简化了加载SpringConfig和SpringMvcConfig配置文件的代码
    // 究其原因就是这里我只需要给出配置文件就可以了，代码会自动完成方式一中的创建对象，注册的操作
    // 但是不推荐，因为看不到创建了什么对象，注册了什么。
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
