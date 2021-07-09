package com.java.service;

import com.java.dao.StudentDao;
import com.java.pojo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhuhongbo
 * @create 2021-07-09-14:35
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public Students queryStudentById(String id) {
        return studentDao.queryStudentById(id);
    }

    @Override
    public Students queryStudent(String id) {
         return studentDao.queryStudent(id);
    }
}
