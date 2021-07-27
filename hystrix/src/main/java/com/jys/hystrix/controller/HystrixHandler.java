package com.jys.hystrix.controller;

import com.jys.hystrix.entity.Student;
import com.jys.hystrix.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-20 19:41
 * @program SpringCloud001
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/getPort")
    public String index(){
        return feignProviderClient.getPort();
    }
}
