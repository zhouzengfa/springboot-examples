package com.zzf.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 扩展Spring MVC的功能
//@EnableWebMvc // 完全控制WebMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    // 浏览器发送 /mvc 请求转到mvc.html
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/mvc").setViewName("mvc");
    }
}
