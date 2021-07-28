package com.jys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-28 09:48
 * @program SpringCloud001
 */
@SpringBootApplication
@EnableConfigServer
public class GithubConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GithubConfigServerApplication.class,args);
    }
}
