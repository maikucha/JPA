package com.company.controller;

import com.company.model.StudentModel;
import com.company.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author jyy
 * @Description {}
 * @Date 2019/6/25 15:59
 */
@Api(value = "测试样例")
@RestController
@RequestMapping(value = {"/api/v1/students"})
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "查询所有学生信息")
    @RequestMapping(method = RequestMethod.GET)
    public List<StudentModel> getAllStudentMessages() {
        return studentService.getAllStudentMessages();
    }

    @ApiOperation(value = "保存学生信息")
    @RequestMapping(method = RequestMethod.POST)
    public void saveStudentMessage() {

    }
}
