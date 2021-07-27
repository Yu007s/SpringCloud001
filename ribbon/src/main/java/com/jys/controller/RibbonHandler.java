package com.jys.controller;

import com.jys.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-12 10:48
 * @program SpringCloud001
 */
@RequestMapping("/ribbon")
@RestController
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 原来host 地址对应
     * spring.application.name: XXXXXXX
     * @return
     */
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://providerJYS/student/findAll", Collection.class);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://providerJYS/student/getPort",String.class);
    }
}
