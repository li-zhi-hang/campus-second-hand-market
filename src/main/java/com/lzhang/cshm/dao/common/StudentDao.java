package com.lzhang.cshm.dao.common;

import com.lzhang.cshm.domain.common.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author:lizhihang
 * @date: 2024/1/19 13:54
 * @description: 添加mapper
 */


@Mapper
public interface StudentDao {

    @Insert("insert into student (create_time, update_time, academy, grade, mobile, nickname, qq, school, sn, head_pic, status, password) values (#{create_time}, #{update_time},#{academy},#{grade},#{mobile},#{nickname},#{qq},#{school},#{sn},#{head_pic},#{status},#{password})")
    int addStu(Student student);

    @Delete("delete from student where id = #{id}")
    void deleteById(Long id);

    @Update("update student set update_time = #{update_time}, academy = #{academy}, grade = #{grade}, mobile = #{mobile}, nickname = #{nickname}, qq = #{qq}, school = #{school}, sn = #{sn}, head_pic = #{head_pic}, status = #{status}, password = #{password} where id = #{id}")
    int modifyStu(Student student);

    @Select("select * from student where id = #{id}")
    Student findById(Long id);

    @Select("select * from student where sn = #{sn}")
    Student findBySn(String sn);

    @Select("SELECT * FROM student WHERE sn LIKE CONCAT('%', #{student.sn}, '%') /* 这里添加其他条件 */")
    List<Student> findAll(@Param("student") Student student);




    @Select("select count(*) from student")
    long count();
}