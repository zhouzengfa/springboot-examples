package com.demo.autoconfig;

public class TestService {

    Config config;

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    String getFullName(String name)
    {
        return config.prefix+"-"+name+"-" + config.suffix;
    }
}
