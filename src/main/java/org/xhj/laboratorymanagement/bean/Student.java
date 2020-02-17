package org.xhj.laboratorymanagement.bean;

public class Student {

    private Integer student_id;
    private String student_name;
    private String student_num;
    private String student_pwd;
    private String student_sex;
    private String student_depart;
    private String student_spe;
    private String student_class;

    public Student() {
    }

    public Student(Integer student_id, String student_name, String student_num, String student_pwd, String student_sex,
                   String student_depart, String student_spe, String student_class) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_num = student_num;
        this.student_pwd = student_pwd;
        this.student_sex = student_sex;
        this.student_depart = student_depart;
        this.student_spe = student_spe;
        this.student_class = student_class;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_num() {
        return student_num;
    }

    public void setStudent_num(String student_num) {
        this.student_num = student_num;
    }

    public String getStudent_pwd() {
        return student_pwd;
    }

    public void setStudent_pwd(String student_pwd) {
        this.student_pwd = student_pwd;
    }

    public String getStudent_sex() {
        return student_sex;
    }

    public void setStudent_sex(String student_sex) {
        this.student_sex = student_sex;
    }

    public String getStudent_depart() {
        return student_depart;
    }

    public void setStudent_depart(String student_depart) {
        this.student_depart = student_depart;
    }

    public String getStudent_spe() {
        return student_spe;
    }

    public void setStudent_spe(String student_spe) {
        this.student_spe = student_spe;
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_num='" + student_num + '\'' +
                ", student_pwd='" + student_pwd + '\'' +
                ", student_sex='" + student_sex + '\'' +
                ", student_depart='" + student_depart + '\'' +
                ", student_spe='" + student_spe + '\'' +
                ", student_class='" + student_class + '\'' +
                '}';
    }
}
