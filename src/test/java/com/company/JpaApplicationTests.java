package com.company;

import com.company.dao.StudentDao;
import com.company.model.StudentModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void contextLoads() {
        StudentModel studentModel = new StudentModel();
        studentModel.setId(1);
        studentModel.setName("李明");
        studentModel.setAge(20);
        studentDao.save(studentModel);
        List<StudentModel> studentModelList = studentDao.findAll();
        studentModelList.forEach(e->System.out.println(e.toString()));
    }

}
