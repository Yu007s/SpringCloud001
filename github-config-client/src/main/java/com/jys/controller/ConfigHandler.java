package com.jys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-28 10:00
 * @program SpringCloud001
 */
@RestController
public class ConfigHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort(){
        return this.port;
    }
}
