package com.demo.test;

import com.demo.autoconfig.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

    @Autowired
    TestService service;

    @GetMapping("/hello")
    public String hello() {
        return service.getFullName("zhou");
    }

}
