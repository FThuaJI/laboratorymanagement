package org.xhj.laboratorymanagement.service;

import org.springframework.stereotype.Service;
import org.xhj.laboratorymanagement.bean.Student;
import org.xhj.laboratorymanagement.mapper.StudentMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    public void insertStudent(Student student){
        studentMapper.insertStudent(student);
    }

    public Student selectStudent(String student_name,String student_pwd){
        return studentMapper.selectStudent(student_name,student_pwd);
    }

    public List<Student> findStudent(){
        return studentMapper.findStudent();
    }

    public int addStudent(Student student){
        return studentMapper.addStudent(student);
    }

    public int updateStudent(Student student){
        return studentMapper.updateStudent(student);
    }

    public int deleteStudent(Integer student_id){
        return studentMapper.deleteStudent(student_id);
    }

    public int selectCount(){
        return studentMapper.selectCount();
    }
}
