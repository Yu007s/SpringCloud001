package com.jys.controller;

import com.jys.entity.Student;
import com.jys.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-13 22:46
 * @program SpringCloud001
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/getPort")
    public String getPort(){
        return feignProviderClient.getPort();
    }
}
