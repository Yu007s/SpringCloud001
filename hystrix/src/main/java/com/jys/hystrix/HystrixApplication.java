package com.jys.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-20 18:59
 * @program SpringCloud001
 */
@SpringBootApplication
@EnableFeignClients
//声明启用数据监控
@EnableCircuitBreaker
//声明启用可视化数据监控
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
    }
}
