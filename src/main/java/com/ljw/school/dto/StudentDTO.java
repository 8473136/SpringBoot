package com.ljw.school.dto;

import lombok.Data;

import javax.persistence.Table;

/**
 * 学生DTO
 * @author 84731
 */
@Data
@Table(name = "student")
public class StudentDTO {
    /** id */
    private Integer id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private Integer age;
    /** 性别 0男 1女 2保密*/
    private Integer sex;
    /** 班级id*/
    private Integer classId;
    /** 地址 */
    private String address;
    /** 电话 */
    private String phone;

}
