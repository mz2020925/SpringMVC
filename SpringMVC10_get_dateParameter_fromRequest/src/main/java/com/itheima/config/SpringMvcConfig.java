package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// 3.在config包里面创建springMVC的配置文件，加载controller对应的Bean
@Configuration
@ComponentScan("com.itheima.controller")
// 当我们把SpringConfig和SpringMvcConfig放在com.itheima.config中的时候，
// 这里加载@ComponentScan("com.itheima.controller")依然会导致Spring的过滤加载Bean方式能加载到SpringMvc的Controller的Bean
// 当我们把SpringConfig和SpringMvcConfig移动到com下级或者com上级的时候，就可以使Spring无法加载到SpringMvc的Controller的Bean
@EnableWebMvc
public class SpringMvcConfig {
}
