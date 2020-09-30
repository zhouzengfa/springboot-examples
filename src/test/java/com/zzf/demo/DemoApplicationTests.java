package com.zzf.demo;

import com.zzf.demo.bean.Person;
import com.zzf.demo.bean.TestPropertySource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private TestPropertySource testPropertySource;
    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(testPropertySource);
    }

}
