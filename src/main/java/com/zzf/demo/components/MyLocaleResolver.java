package com.zzf.demo.components;


import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(l)) {
            String[] params = l.split("_");
            locale = new Locale(params[0], params[1]);
        }

        return  locale;
    }
}
