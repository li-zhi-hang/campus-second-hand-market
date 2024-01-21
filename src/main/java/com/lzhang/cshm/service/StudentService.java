package com.lzhang.cshm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzhang.cshm.bean.PageBean;
import com.lzhang.cshm.dao.common.StudentDao;
import com.lzhang.cshm.domain.common.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author:lizhihang
 * @date: 2024/1/20 17:08
 * @description: student服务层
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    /**
     * 根据学号查询
     * @param sn
     * @return
     */
    public Student findBySn(String sn){
        return studentDao.findBySn(sn);
    }

    /**
     * 根据id查找
     * @param id
     * @return
     */
    public Student findById(Long id){
        return studentDao.findById(id);
    }

    /**
     * 添加学生
     * @param student
     * @return
     */
    public int addStu(Student student){
        return studentDao.addStu(student);
    }

    /**
     * 修改
     * @param student
     * @return
     */
    public int modifyStu(Student student){
        return studentDao.modifyStu(student);
    }

    /**
     * 搜索学生列表
     * @param pageBean
     * @param student
     * @return
     */
    public PageBean<Student> findlist(PageBean<Student> pageBean, Student student) {
        // 设置分页参数
        PageHelper.startPage(pageBean.getCurrentPage(), pageBean.getPageSize());

        // 执行查询
        List<Student> students = studentDao.findAll(student);

        // 获取分页信息
        PageInfo<Student> pageInfo = new PageInfo<>(students);

        // 设置PageBean
        pageBean.setContent(pageInfo.getList()); // 设置当前页的数据
        pageBean.setTotal(pageInfo.getTotal()); // 设置总记录数
        pageBean.setTotalPage(pageInfo.getPages()); // 设置总页数

        return pageBean;
    }


    /**
     * 根据id删除
     * @param id
     */
    public void delete(Long id){
        studentDao.deleteById(id);
    }

    /**
     * 获取学生总数
     * @return
     */
    public long total(){
        return studentDao.count();
    }

}
