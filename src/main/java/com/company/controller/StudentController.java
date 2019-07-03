package com.company.controller;

import com.company.common.ResultGenerator;
import com.company.model.Result;
import com.company.model.StudentModel;
import com.company.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author jyy
 * @Description {}
 * @Date 2019/6/25 15:59
 */
@RestController
@RequestMapping(value = {"/api/v1/students"})
@Api(description = "学生信息相关接口", tags = "学生")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "查询所有学生信息")
    @RequestMapping(method = RequestMethod.GET)
    public Result getAllStudentMessages() {
        return ResultGenerator.genSuccessResult(studentService.getAllStudentMessages());
    }

    @ApiOperation(value = "保存学生信息")
    @RequestMapping(method = RequestMethod.POST)
    public Result saveStudentMessage(@ApiParam(name = "studentModel", value = "学生实体", required = true) @RequestBody StudentModel studentModel) {
        return studentService.saveStudentMessage(studentModel);
    }

    @ApiOperation(value = "保存学生信息")
    @RequestMapping(method = RequestMethod.PUT)
    public Result updateStudentMessage(@ApiParam(name = "studentModel", value = "学生实体", required = true) @RequestBody StudentModel studentModel) {
        return studentService.saveStudentMessage(studentModel);
    }

    @ApiOperation(value = "删除学生信息")
    @RequestMapping(method = RequestMethod.DELETE)
    public Result deleteStudentMessage(@ApiParam(name = "id", value = "学生编号", required = true) @RequestParam Integer id) {
        return studentService.deleteStudentMessage(id);
    }
}
