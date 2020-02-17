package org.xhj.laboratorymanagement.bean;

import java.io.Serializable;

public class Appointment implements Serializable {

    private Integer lab_appointment_id;
    private Integer laboratory_id;
    private Integer student_id;
    private String student_name;
    private String lab_appointment_name;
    private String lab_appointment_build;
    private String lab_appointment_num;
    private String lab_appointment_date;
    private Integer lab_appointment_time;
    private Integer lab_appointment_capacity;
    private String lab_appointment_class;
    private Integer lab_appointment_people;
    private String lab_appointment_teacher;
    private String lab_appointment_reason;
    private Integer lab_appointment_type;
    private Integer lab_appointment_handle;

    public Appointment() {
    }

    public Appointment(Integer lab_appointment_id, Integer laboratory_id, Integer student_id, String lab_appointment_name, String lab_appointment_build,
                       String lab_appointment_num, String lab_appointment_date, Integer lab_appointment_time,
                       Integer lab_appointment_capacity, String lab_appointment_class, Integer lab_appointment_people, String lab_appointment_teacher,
                       String lab_appointment_reason, Integer lab_appointment_type, Integer lab_appointment_handle) {
        this.lab_appointment_id = lab_appointment_id;
        this.laboratory_id = laboratory_id;
        this.student_id = student_id;
        this.lab_appointment_name = lab_appointment_name;
        this.lab_appointment_build = lab_appointment_build;
        this.lab_appointment_num = lab_appointment_num;
        this.lab_appointment_date = lab_appointment_date;
        this.lab_appointment_time = lab_appointment_time;
        this.lab_appointment_capacity = lab_appointment_capacity;
        this.lab_appointment_class = lab_appointment_class;
        this.lab_appointment_people = lab_appointment_people;
        this.lab_appointment_teacher = lab_appointment_teacher;
        this.lab_appointment_reason = lab_appointment_reason;
        this.lab_appointment_type = lab_appointment_type;
        this.lab_appointment_handle = lab_appointment_handle;
    }

    public String getLab_appointment_date() {
        return lab_appointment_date;
    }

    public void setLab_appointment_date(String lab_appointment_date) {
        this.lab_appointment_date = lab_appointment_date;
    }

    public String getLab_appointment_reason() {
        return lab_appointment_reason;
    }

    public void setLab_appointment_reason(String lab_appointment_reason) {
        this.lab_appointment_reason = lab_appointment_reason;
    }

    public Integer getLab_appointment_type() {
        return lab_appointment_type;
    }

    public void setLab_appointment_type(Integer lab_appointment_type) {
        this.lab_appointment_type = lab_appointment_type;
    }

    public Integer getLaboratory_id() {
        return laboratory_id;
    }

    public void setLaboratory_id(Integer laboratory_id) {
        this.laboratory_id = laboratory_id;
    }

    public String getLab_appointment_name() {
        return lab_appointment_name;
    }

    public void setLab_appointment_name(String lab_appointment_name) {
        this.lab_appointment_name = lab_appointment_name;
    }

    public String getLab_appointment_build() {
        return lab_appointment_build;
    }

    public void setLab_appointment_build(String lab_appointment_build) {
        this.lab_appointment_build = lab_appointment_build;
    }

    public String getLab_appointment_num() {
        return lab_appointment_num;
    }

    public void setLab_appointment_num(String lab_appointment_num) {
        this.lab_appointment_num = lab_appointment_num;
    }

    public Integer getLab_appointment_time() {
        return lab_appointment_time;
    }

    public void setLab_appointment_time(Integer lab_appointment_time) {
        this.lab_appointment_time = lab_appointment_time;
    }

    public Integer getLab_appointment_capacity() {
        return lab_appointment_capacity;
    }

    public void setLab_appointment_capacity(Integer lab_appointment_capacity) {
        this.lab_appointment_capacity = lab_appointment_capacity;
    }

    public Integer getLab_appointment_people() {
        return lab_appointment_people;
    }

    public void setLab_appointment_people(Integer lab_appointment_people) {
        this.lab_appointment_people = lab_appointment_people;
    }

    public String getLab_appointment_teacher() {
        return lab_appointment_teacher;
    }

    public void setLab_appointment_teacher(String lab_appointment_teacher) {
        this.lab_appointment_teacher = lab_appointment_teacher;
    }

    public Integer getLab_appointment_id() {
        return lab_appointment_id;
    }

    public void setLab_appointment_id(Integer lab_appointment_id) {
        this.lab_appointment_id = lab_appointment_id;
    }

    public String getLab_appointment_class() {
        return lab_appointment_class;
    }

    public void setLab_appointment_class(String lab_appointment_class) {
        this.lab_appointment_class = lab_appointment_class;
    }

    public Integer getLab_appointment_handle() {
        return lab_appointment_handle;
    }

    public void setLab_appointment_handle(Integer lab_appointment_handle) {
        this.lab_appointment_handle = lab_appointment_handle;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "lab_appointment_id=" + lab_appointment_id +
                ", laboratory_id=" + laboratory_id +
                ", student_id=" + student_id +
                ", lab_appointment_name='" + lab_appointment_name + '\'' +
                ", lab_appointment_build='" + lab_appointment_build + '\'' +
                ", lab_appointment_num='" + lab_appointment_num + '\'' +
                ", lab_appointment_date='" + lab_appointment_date + '\'' +
                ", lab_appointment_time=" + lab_appointment_time +
                ", lab_appointment_capacity=" + lab_appointment_capacity +
                ", lab_appointment_class=" + lab_appointment_class +
                ", lab_appointment_people=" + lab_appointment_people +
                ", lab_appointment_teacher='" + lab_appointment_teacher + '\'' +
                ", lab_appointment_reason='" + lab_appointment_reason + '\'' +
                ", lab_appointment_type=" + lab_appointment_type +
                ", lab_appointment_handle=" + lab_appointment_handle +
                '}';
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
}
