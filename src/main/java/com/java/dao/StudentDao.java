package com.java.dao;

import com.java.pojo.Students;

/**
 * @author zhuhongbo
 * @create 2021-07-09-14:34
 */
public interface StudentDao {
    Students queryStudentById(String id);

    Students queryStudent(String id);
}
