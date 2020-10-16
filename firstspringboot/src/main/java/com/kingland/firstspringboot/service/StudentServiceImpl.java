/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.firstspringboot.service;

import com.kingland.firstspringboot.mapper.StudentModelMapper;
import com.kingland.firstspringboot.model.StudentModel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author KSC
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentModelMapper mapper;

    public StudentServiceImpl(StudentModelMapper mapper) {
        this.mapper = mapper;
    }

    @Cacheable(cacheNames = "student")
    @Override
    public List<StudentModel> getAllStudents() {
        return mapper.getAllStudents();
    }

    @Cacheable(cacheNames = "student", key = "#{id}")
    @Override
    public StudentModel getStudentById(long id) {
        return mapper.getStudentById(id);
    }

    @Cacheable(cacheNames = "student", key = "#{id}")
    @Override
    public int addStudent(StudentModel student) {
        return mapper.addStudent(student);
    }

    @Cacheable(cacheNames = "student", key = "#{id}")
    @Override
    public int updateStudentById(StudentModel student) {
        return mapper.updateStudentById(student);
    }

    @Cacheable(cacheNames = "student", key = "#{id}")
    @Override
    public int deleteStudentById(long id) {
        return deleteStudentById(id);
    }


}
