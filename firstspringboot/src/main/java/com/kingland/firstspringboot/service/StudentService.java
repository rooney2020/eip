package com.kingland.firstspringboot.service;

import com.kingland.firstspringboot.model.StudentModel;

import java.util.List;

public interface StudentService {
    List<StudentModel> getAllStudents();
    StudentModel getStudentById(long id);
    int addStudent(StudentModel student);
    int updateStudentById(StudentModel student);
    int deleteStudentById(long id);
}
