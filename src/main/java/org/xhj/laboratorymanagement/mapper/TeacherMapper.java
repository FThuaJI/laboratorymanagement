package org.xhj.laboratorymanagement.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.xhj.laboratorymanagement.bean.Teacher;

import java.util.List;

public interface TeacherMapper {

    @Insert("insert into teacher(teacher_name,teacher_num,teacher_pwd,teacher_sex,teacher_depart) " +
            "values (#{teacher_name},#{teacher_num},#{teacher_pwd},#{teacher_sex},#{teacher_depart})")
    int insertTeacher(Teacher teacher);

    @Select("select * from teacher where teacher_name = #{teacher_name} and teacher_pwd = #{teacher_pwd}")
    Teacher selectTeacher(String teacher_name,String teacher_pwd);

    @Select("select * from teacher")
    List<Teacher> findTeacher();

    @Update("update teacher set teacher_name=#{teacher_name},teacher_num = #{teacher_num},teacher_sex = #{teacher_sex}," +
            "teacher_depart = #{teacher_depart} where teacher_id = #{teacher_id}")
    int updateTeacher(Teacher teacher);

    @Delete("delete from teacher where teacher_id = #{teacher_id}")
    int deleteTeacher(Integer teacher_id);

    @Select("select count(*) from teacher")
    int selectCount();
}
