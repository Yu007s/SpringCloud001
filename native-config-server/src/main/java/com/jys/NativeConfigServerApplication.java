package com.jys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-22 19:38
 * @program SpringCloud001
 */
@SpringBootApplication
/**声明配置中心**/
@EnableConfigServer
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
