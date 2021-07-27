package com.jys.controller;

import com.jys.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @description:
 * @Author: JiaoYuSheng
 * @Date: 2021-07-10 11:39
 * @program SpringCloud001
 */

@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8081/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8081/student/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id")long id){
        return restTemplate.getForObject("http://localhost:8081/student/findById/{id}",Student.class,id);
    };
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        Object o =  restTemplate.postForEntity("http://localhost:8081/student/save",student,null).getBody();
        int i =1;
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8081/student/update",student,Student.class);
        int i =1;
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8081/student/deleteById/{id}",id); }

}
