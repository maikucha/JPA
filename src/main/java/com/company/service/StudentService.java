package com.company.service;

import com.company.dao.StudentDao;
import com.company.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
