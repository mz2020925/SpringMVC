package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 3.在config包里面创建springMVC的配置文件，加载controller对应的Bean
@Configuration
@ComponentScan("com.itheima.controller")
public class SpringMvcConfig {
}
