package com.zzf.demo;

import com.zzf.demo.bean.Person;
import com.zzf.demo.bean.TestPropertySource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private TestPropertySource testPropertySource;

    @Autowired
    public ApplicationContext ioc;

    @Autowired
    public DataSource dataSource;

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

    @Test
    public void testJdbc() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        connection.close();
    }
}
