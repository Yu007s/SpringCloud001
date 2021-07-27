package com.jys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * @description: Zuul网关启动类
 * @Author: JiaoYuSheng
 * @Date: 2021-07-10 14:43
 * @program SpringCloud001
 */
/*启用 SpringBoot 的自动配置机制（自动装载配置）(@SpringBootApplication这个注解囊括了该注解)**/
/*它可以帮助SpringBoot应用将所有符合条件的@Configuration配置加载到当前SpringBoot创建并使用的IoC容器中**/
@EnableAutoConfiguration
@EnableZuulProxy  /*生成网关代理 : 包含了@EnableZuulServer,设置该类是网关启动类**/
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
