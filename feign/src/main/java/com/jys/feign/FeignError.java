package com.jys.feign;

import com.jys.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-13 23:34
 * @program SpringCloud001
 */
@Component
public class FeignError implements FeignProviderClient{
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String getPort() {
        return "服务器维护中。。。。";
    }
}
