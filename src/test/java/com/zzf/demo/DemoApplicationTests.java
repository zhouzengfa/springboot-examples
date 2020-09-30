package com.zzf.demo;

import com.zzf.demo.bean.Person;
import com.zzf.demo.bean.TestPropertySource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private TestPropertySource testPropertySource;

    @Autowired
    public ApplicationContext ioc;

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(testPropertySource);
    }

    @Test
    public void testHelloService()
    {
        boolean b = ioc.containsBean("helloService");
        System.out.println("添加helloService到容器"+b);
    }
}
