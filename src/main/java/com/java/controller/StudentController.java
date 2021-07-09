package com.java.controller;

import com.java.pojo.Students;
import com.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuhongbo
 * @create 2021-07-09-14:35
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/hello")
    public Students queryStudentById(String id){
        return studentService.queryStudentById(id);
    }
    @RequestMapping("/hello2")
    public Students queryStudent(String id){
        return studentService.queryStudent(id);
    }
    @RequestMapping("/hello3")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/hello4")
    public String hello2(){
        return "你好";
    }
    @RequestMapping("/hello5")
    public String hello3(){
        System.out.println("成功访问");
        System.out.println("又一次成功访问");
        return "one piece";
    }
}
