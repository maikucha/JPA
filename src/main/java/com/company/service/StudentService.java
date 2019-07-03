package com.company.service;

import com.company.common.ResultGenerator;
import com.company.dao.StudentDao;
import com.company.model.Result;
import com.company.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author jyy
 * @Description {}
 * @Date 2019/6/25 15:55
 */
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    /**
     * 查询所有学生信息
     */
    public List<StudentModel> getAllStudentMessages() {
        List<StudentModel> studentModelList = studentDao.findAll();
        return studentModelList;
    }

    /**
     * 保存学生信息
     *
     * @param studentModel
     * @return
     */
    public Result saveStudentMessage(StudentModel studentModel) {
        StudentModel studentModelNew;
        try {
            studentModelNew = studentDao.save(studentModel);
        } catch (Exception e) {
            return ResultGenerator.genFailResult("保存失败");
        }
        if (studentModelNew == null) {
            return ResultGenerator.genFailResult("保存失败");
        } else {
            return ResultGenerator.genSuccessResult(studentModelNew);
        }
    }

    /**
     * 删除学生信息
     *
     * @param id
     * @return
     */
    public Result deleteStudentMessage(Integer id) {
        try {
            studentDao.deleteById(id);
        } catch (Exception e) {
            return ResultGenerator.genFailResult("删除失败");
        }
        return ResultGenerator.genSuccessResult("删除成功");
    }

}
