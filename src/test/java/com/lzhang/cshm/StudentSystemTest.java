package com.lzhang.cshm;

import com.lzhang.cshm.bean.PageBean;
import com.lzhang.cshm.dao.common.StudentDao;
import com.lzhang.cshm.domain.common.Student;
import com.lzhang.cshm.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author:lizhihang
 * @date: 2024/1/19 14:00
 * @description: 测试后台学生数据操作
 */

@SpringBootTest
public class StudentSystemTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void insertTest(){
        Student s = new Student();
        s.setAcademy("附属民族学院");
        s.setGrade("100");
        s.setSn("2022026183");
        s.setPassword("123");
        studentService.addStu(s);
    }

    @Test
    public void deleteTest(){
        studentService.delete((long) 15);
    }

    @Test
    public void updateTest(){
        Student s = studentService.findBySn("2022026183");
        s.setGrade("10000");
        System.out.println(studentService.modifyStu(s));
    }

    @Test
    public void selectTest(){
        System.out.println(studentService.total());
        PageBean pageBean = new PageBean();
        pageBean.setPageSize(2);
        Student s = new Student();
        s.setSn("10");
        PageBean P = studentService.findlist(pageBean, s);
        System.out.println(P.getContent());
        System.out.println(P.getTotal());
        System.out.println(P.getTotalPage());
    }
}
