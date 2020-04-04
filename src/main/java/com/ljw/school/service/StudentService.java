package com.ljw.school.service;

import com.github.pagehelper.PageInfo;
import com.ljw.school.dto.StudentDTO;
import com.ljw.school.rvo.StudentRVO;

import java.util.List;

public interface StudentService {

    List<StudentDTO> selectAllStudent();

    Integer addStudent(StudentDTO studentDTO);

    List<StudentRVO> selectStudentClass();

    PageInfo<StudentDTO> selectPageStudent();
}
