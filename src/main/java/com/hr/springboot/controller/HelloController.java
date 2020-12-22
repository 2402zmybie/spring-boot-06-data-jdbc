package com.hr.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/map")
    private Map<String,Object> map() {
        //{"id":1,"departmentName":"AA"}
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from department");
        return list.get(0);
    }
}
