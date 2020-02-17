package org.xhj.laboratorymanagement.bean;

public class Teacher {

    private Integer teacher_id;
    private String teacher_name;
    private String teacher_num;
    private String teacher_pwd;
    private String teacher_sex;
    private String teacher_depart;

    public Teacher() {
    }

    public Teacher(Integer teacher_id, String teacher_name, String teacher_num, String teacher_pwd, String teacher_sex, String teacher_depart) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.teacher_num = teacher_num;
        this.teacher_pwd = teacher_pwd;
        this.teacher_sex = teacher_sex;
        this.teacher_depart = teacher_depart;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_num() {
        return teacher_num;
    }

    public void setTeacher_num(String teacher_num) {
        this.teacher_num = teacher_num;
    }

    public String getTeacher_pwd() {
        return teacher_pwd;
    }

    public void setTeacher_pwd(String teacher_pwd) {
        this.teacher_pwd = teacher_pwd;
    }

    public String getTeacher_sex() {
        return teacher_sex;
    }

    public void setTeacher_sex(String teacher_sex) {
        this.teacher_sex = teacher_sex;
    }

    public String getTeacher_depart() {
        return teacher_depart;
    }

    public void setTeacher_depart(String teacher_depart) {
        this.teacher_depart = teacher_depart;
    }
}
