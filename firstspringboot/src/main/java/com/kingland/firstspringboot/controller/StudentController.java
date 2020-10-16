/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.firstspringboot.controller;

import com.kingland.firstspringboot.model.StudentModel;
import com.kingland.firstspringboot.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author KSC
 */
@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("student/get")
    public List<StudentModel> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("student/get/{id}")
    public StudentModel getStudentById(@PathVariable long id) {
        return service.getStudentById(id);
    }

    @PostMapping("student/add")
    public int addStudent(@RequestBody StudentModel student) {
        return service.addStudent(student);
    }

    @PostMapping("student/update")
    public int updateStudentById(@RequestBody StudentModel student) {
        return service.updateStudentById(student);
    }

    @GetMapping("student/delete/{id}")
    public int deleteStudentById(@PathVariable long id) {
        return service.deleteStudentById(id);
    }

}
