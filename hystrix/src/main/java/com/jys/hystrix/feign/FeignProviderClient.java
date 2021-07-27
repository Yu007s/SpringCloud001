package com.jys.hystrix.feign;


import com.jys.hystrix.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @description: Feign服务
 * @Author: JiaoYuSheng
 * @Date: 2021-07-13 22:36
 * @program SpringCloud001
 */


@FeignClient(value = "providerJYS")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/getPort")
    public String getPort();
}
