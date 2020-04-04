package com.ljw.school.service;

import com.ljw.school.dto.ClassDTO;

import java.util.List;

public interface ClassService {

    List<ClassDTO> selectAllClass();

    Integer addClass(ClassDTO classDTO);

}
