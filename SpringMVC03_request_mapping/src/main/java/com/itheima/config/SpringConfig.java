package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Configuration
// @ComponentScan({"com.itheima.service", "com.itheima.dao"})  // 避免加载controller的方式一,具体写出要扫描的包，而不是写"com.itheima"这种大范围的
@ComponentScan(value = "com.itheima",  // 避免加载controller的方式二，写"com.itheima"这种大范围的，同时排除掉不要加载的包，排除方式设置为：排除包含@Controller注解的类
    excludeFilters = @ComponentScan.Filter(
            type = FilterType.ANNOTATION,
            classes = Controller.class
    )
)
public class SpringConfig {
}
