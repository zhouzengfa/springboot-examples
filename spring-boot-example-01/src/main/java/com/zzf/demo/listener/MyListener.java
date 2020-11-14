package com.zzf.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("MyListener start......");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("MyListener stop.....");
    }
}
