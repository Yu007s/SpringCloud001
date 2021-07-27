package com.jys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 服务消费者启动类
 * @Author: JiaoYuSheng
 * @Date: 2021-07-10 11:36
 * @program SpringCloud001
 */

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){return new RestTemplate();}
}
