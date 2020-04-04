package com.ljw.school.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.ljw.school.dto.StudentDTO;
import com.ljw.school.rvo.StudentRVO;
import com.ljw.school.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;
    @GetMapping("/selectAllStudent")
    public List<StudentDTO> selectAllStudent(){
        return studentService.selectAllStudent();
    }


    @PostMapping("/addStudent")
    public Integer addStudent( StudentDTO studentDTO){
        return studentService.addStudent(studentDTO);
    }

    @GetMapping("/selectStudentClass")
    public List<StudentRVO> selectStudentClass(){
        return studentService.selectStudentClass();
    }

    @GetMapping("/selectPageStudent")
    public PageInfo<StudentDTO> selectPageStudent(){
        return studentService.selectPageStudent();
    }

}
