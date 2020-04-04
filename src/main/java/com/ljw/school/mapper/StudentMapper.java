package com.ljw.school.mapper;

import com.ljw.school.dto.StudentDTO;
import com.ljw.school.rvo.StudentRVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StudentMapper extends Mapper<StudentDTO> {

    List<StudentRVO> selectStudentClass();

}
