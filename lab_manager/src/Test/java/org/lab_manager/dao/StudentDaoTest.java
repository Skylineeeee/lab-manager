package org.lab_manager.dao;

import org.junit.Test;

import org.lab_manager.entity.Student;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xiaofeige on 2016/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class StudentDaoTest {
    @Autowired
    private StudentDao mStudentDao;

    @Test
    public void queryById() throws Exception {
        Student s=mStudentDao.queryById("111132");
        System.out.println(s.getName());
    }

}