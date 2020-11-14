package com.demo.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 配置类
@ConfigurationProperties(prefix = "com.demo.starter")
public class Config {
    public String prefix;
    public String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
