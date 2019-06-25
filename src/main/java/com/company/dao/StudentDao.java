package com.company.dao;

import com.company.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author jyy
 * @Description {}
 * @Date 2019/6/24 17:38
 */
@Repository
public interface StudentDao extends JpaRepository<StudentModel, Integer> {
}
