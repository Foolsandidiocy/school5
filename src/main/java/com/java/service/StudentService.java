package com.java.service;

import com.java.pojo.Students;

/**
 * @author zhuhongbo
 * @create 2021-07-09-14:35
 */
public interface StudentService {
    Students queryStudentById(String id);

    Students queryStudent(String id);
}
