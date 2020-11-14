package com.zzf.demo.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password, Map<String, Object> map,
                        HttpSession session)
    {
        if (!StringUtils.isEmpty(username) && password.equals("123456"))
        {
            // 防止重复提交，使用重定向
            session.setAttribute("isLogin", username);
            return "redirect:/main.html";
        }
        else
        {
            map.put("error", "用户名密码错误");
            return "login";
        }
    }
}
