package org.xhj.laboratorymanagement.service;

import org.springframework.stereotype.Service;
import org.xhj.laboratorymanagement.bean.Teacher;
import org.xhj.laboratorymanagement.mapper.TeacherMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    public int insertTeacher(Teacher teacher){
        return teacherMapper.insertTeacher(teacher);
    }

    public Teacher selectTeacher(String teacher_name,String teacher_pwd){
        return teacherMapper.selectTeacher(teacher_name,teacher_pwd);
    }

    public List<Teacher> findTeacher(){
        return teacherMapper.findTeacher();
    }

    public int updateTeacher(Teacher teacher){
        return teacherMapper.updateTeacher(teacher);
    }

    public int deleteTeacher(Integer teacher_id){
        return teacherMapper.deleteTeacher(teacher_id);
    }

    public int selectCount(){
        return teacherMapper.selectCount();
    }
}
