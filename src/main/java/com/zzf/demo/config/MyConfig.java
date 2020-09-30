package com.zzf.demo.config;

import com.zzf.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuraton 表示此类是一个配置类
 * @Bean 表示向容器中添加组件
 */
@Configuration
public class MyConfig {

    // 将方法的返回值添加到容器中，容器中这个组件默认的id就是这个方法名
    @Bean
    HelloService helloService()
    {
        return  new HelloService();
    }
}
