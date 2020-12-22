package com.hr.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringBoot06DataJdbcApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        //class com.zaxxer.hikari.HikariDataSource
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        //HikariProxyConnection@1756143301 wrapping com.mysql.cj.jdbc.ConnectionImpl@a50d709
        System.out.println(connection);
        connection.close();

    }

}
