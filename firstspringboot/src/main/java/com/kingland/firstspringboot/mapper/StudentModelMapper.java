/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.firstspringboot.mapper;

import com.kingland.firstspringboot.model.StudentModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author KSC
 */
@Mapper
public interface StudentModelMapper {
    List<StudentModel> getAllStudents();
    StudentModel getStudentById(long id);
    int addStudent(StudentModel student);
    int updateStudentById(StudentModel student);
    int deleteStudentById(long id);
}
