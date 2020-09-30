package com.zzf.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = {"classpath:propertysource.properties"})
@Component
@ConfigurationProperties(prefix = "data")
public class TestPropertySource {
    private String name;
    private Integer prop1;
    private Boolean prop2;

    @Override
    public String toString() {
        return "TestPropertySource{" +
                "name='" + name + '\'' +
                ", prop1=" + prop1 +
                ", prop2=" + prop2 +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProp1() {
        return prop1;
    }

    public void setProp1(Integer prop1) {
        this.prop1 = prop1;
    }

    public Boolean getProp2() {
        return prop2;
    }

    public void setProp2(Boolean prop2) {
        this.prop2 = prop2;
    }


}
