package com.ljw.school.service.impl;

import com.ljw.school.dto.ClassDTO;
import com.ljw.school.mapper.ClassMapper;
import com.ljw.school.service.ClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Service实现类
 * @author 84731
 */
@Service
public class ClassServiceImpl implements ClassService {


    @Resource
    private ClassMapper classMapper;

    @Override
    public List<ClassDTO> selectAllClass() {
        return classMapper.selectAll();
    }

    @Override
    public Integer addClass(ClassDTO classDTO) {
        return classMapper.insertSelective(classDTO);
    }
}
