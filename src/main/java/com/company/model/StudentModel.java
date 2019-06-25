package com.company.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.*;

/**
 * @Author jyy
 * @Description {}
 * @Date 2019/6/24 17:33
 */
@Table(name = "Student")
@Entity
@ApiModel("学生信息表")
public class StudentModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(name = "学号")
    public Integer id;
    @ApiModelProperty(name = "姓名")
    public String name;
    @ApiModelProperty(name = "年龄")
    public Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
