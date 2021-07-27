package com.jys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-22 20:40
 * @program SpringCloud001
 */
@RestController
@RequestMapping("/index")
public class NativeConfigHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String poo;

    @GetMapping("/get")
    public String get(){
        System.out.println(poo+port);
        return poo+port;
    }
}
