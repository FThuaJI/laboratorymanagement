package org.xhj.laboratorymanagement.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.xhj.laboratorymanagement.bean.Student;

import java.util.List;


public interface StudentMapper {

    @Insert("insert into student(student_name,student_num,student_pwd,student_sex,student_depart,student_spe," +
            "student_class) values (#{student_name},#{student_num},#{student_pwd},#{student_sex},#{student_depart}," +
            "#{student_spe},#{student_class})")
    void insertStudent(Student student);

    @Select("select * from student where student_name = #{student_name} and student_pwd = #{student_pwd}")
    Student selectStudent(String student_name,String student_pwd);

    @Select("select * from student")
    List<Student> findStudent();

    @Insert("insert into student(student_name,student_num,student_sex,student_depart,student_spe," +
            "student_class) values (#{student_name},#{student_num},#{student_sex},#{student_depart}," +
            "#{student_spe},#{student_class})")
    int addStudent(Student student);

    @Update("update student set student_name=#{student_name},student_num = #{student_num},student_sex = #{student_sex}," +
            "student_depart = #{student_depart},student_spe = #{student_spe},student_class = #{student_class} " +
            "where student_id = #{student_id}")
    int updateStudent(Student student);

    @Delete("delete from student where student_id = #{student_id}")
    int deleteStudent(Integer student_id);

    @Select("select count(*) from student")
    int selectCount();
}
