package com.zzf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class Thymeleaf {

    @RequestMapping("/success")
    public String success(Map<String, Object> map)
    {
        map.put("hello", "测试Thymeleaf的用法");
        map.put("users", Arrays.asList("zhangshan", "lishi", "wangwu"));
        return "success";
    }
}
