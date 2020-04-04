package com.ljw.school.dto;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "class")
public class ClassDTO {

    /** id */
    private Integer id;
    /** 班级名称*/
    private String className;

}
