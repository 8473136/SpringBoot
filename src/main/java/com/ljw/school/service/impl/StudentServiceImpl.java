package com.ljw.school.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljw.school.dto.StudentDTO;
import com.ljw.school.mapper.StudentMapper;
import com.ljw.school.rvo.StudentRVO;
import com.ljw.school.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<StudentDTO> selectAllStudent() {
        return studentMapper.selectAll();
    }

    @Override
    public Integer addStudent(StudentDTO studentDTO) {
        return studentMapper.insertSelective(studentDTO);
    }

    @Override
    public List<StudentRVO> selectStudentClass() {
        return studentMapper.selectStudentClass();
    }

    @Override
    public PageInfo<StudentDTO> selectPageStudent() {
        PageHelper.startPage(1,10);
        return new PageInfo<StudentDTO>(studentMapper.selectAll());
    }


}
