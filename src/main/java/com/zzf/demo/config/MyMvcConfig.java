package com.zzf.demo.config;

import com.zzf.demo.components.MyInterceptor;
import com.zzf.demo.components.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 使用定制的拦截器
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/index.html", "/user/login")
                .excludePathPatterns("/asserts/**")
                .excludePathPatterns("/webjars/**");
    }

    // 改变首页的第二种方式
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer config = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }
        };

        return config;
    }

    // 设置自己的LocaleResoler
    @Bean
    public LocaleResolver localeResolver() {
       return  new MyLocaleResolver();
    }

}
