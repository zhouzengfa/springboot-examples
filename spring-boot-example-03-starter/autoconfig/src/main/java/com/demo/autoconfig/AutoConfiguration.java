package com.demo.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(Config.class)
public class AutoConfiguration {

    @Autowired
    private Config config;

    @Bean
    TestService testService()
    {
        TestService service = new TestService();
        service.setConfig(config);

        return service;
    }
}
