package com.lzhang.cshm.domain.common;

/**
 * @author:lizhihang
 * @date: 2024/1/19 13:45
 * @description: 学生类实体
 */
public class Student extends BaseEntity{
    public static final int STUDENT_STATUS_ENABLE = 1;//状态可用
    public static final int STUDENT_STATUS_UNABLE = 0;//状态不可用

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private String sn;//学生学号
    private String password;//学生登录密码
    private String head_pic;//学生头像
    private String nickname;//昵称
    private String mobile;//手机号
    private String qq;//QQ号
    private String school;//所属学校
    private String academy;//所属学院
    private String grade;//所属年级

    private int status = STUDENT_STATUS_ENABLE;//学生状态，默认可用

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getHead_pic() {
        return head_pic;
    }

    public void setHead_pic(String head_pic) {
        this.head_pic = head_pic;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sn='" + sn + '\'' +
                ", password='" + password + '\'' +
                ", head_pic='" + head_pic + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", qq='" + qq + '\'' +
                ", school='" + school + '\'' +
                ", academy='" + academy + '\'' +
                ", grade='" + grade + '\'' +
                ", status=" + status +
                '}';
    }
}
