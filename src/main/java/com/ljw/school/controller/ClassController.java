package com.ljw.school.controller;

import com.ljw.school.dto.ClassDTO;
import com.ljw.school.service.ClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Resource
    private ClassService classService;

    @GetMapping("/selectAllClass")
    public List<ClassDTO> selectAllClass(){
        return classService.selectAllClass();
    }

    @PostMapping("/addClass")
    public Integer addClass( ClassDTO classDTO){
        return classService.addClass(classDTO);
    }
}
