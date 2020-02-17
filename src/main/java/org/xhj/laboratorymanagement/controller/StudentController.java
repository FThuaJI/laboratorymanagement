package org.xhj.laboratorymanagement.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xhj.laboratorymanagement.bean.ResultMap;
import org.xhj.laboratorymanagement.bean.Student;
import org.xhj.laboratorymanagement.service.StudentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/")
    public String stu(){
        return "student";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/appointment")
    public String appointment(){
        return "appointment";
    }

    @RequestMapping("/insertStudent")
    public String insertStu(Student student){
        studentService.insertStudent(student);
        return "login";
    }

    @RequestMapping("/selectStudent")
    public String selectStu(String student_name, String student_pwd, HttpSession session, Model model){

        Student student=studentService.selectStudent(student_name,student_pwd);
        if (student.getStudent_name().equals(student_name) && student.getStudent_pwd().equals(student_pwd)){
            session.setAttribute("student_name",student.getStudent_name());
            session.setAttribute("student",student);
            session.setAttribute("student_id",student.getStudent_id());
            model.addAttribute("student_id",student.getStudent_id());
        }else{
            return "login";
        }
        return "redirect:/appointment/index";
    }

    @RequestMapping("/findAllStu")
    @ResponseBody
    public ResultMap<List<Student>> findStu(@RequestParam(defaultValue = "1",value = "page") Integer page,
                                            @RequestParam(defaultValue = "10",value = "limit") Integer limit){
        PageHelper.startPage(page,limit);
        List<Student> students=studentService.findStudent();
        PageInfo<Student> pageInfo=new PageInfo<Student>(students,limit);
        int count=studentService.selectCount();
        return new ResultMap<List<Student>>(0,"",count,pageInfo.getList());
    }

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStu(Student student){

        int ok=studentService.addStudent(student);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/updateStudent")
    @ResponseBody
    public String updateStu(Student student){
        System.out.println(student);
        int ok=studentService.updateStudent(student);
        System.out.print(ok);
        if (ok>0) {
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/deleteStudent")
    @ResponseBody
    public String deleteStu(Integer student_id){

        int ok=studentService.deleteStudent(student_id);
        if (ok>0) {
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }
}
