package com.jys.dao;

import com.jys.entity.Student;

import java.util.Collection;

/**
 * @Author: 焦宇盛
 * @Date: 2021/6/29 20:36
 */
public interface StudentDao {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
