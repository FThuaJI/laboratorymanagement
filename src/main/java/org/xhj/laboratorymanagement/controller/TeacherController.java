package org.xhj.laboratorymanagement.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xhj.laboratorymanagement.bean.ResultMap;
import org.xhj.laboratorymanagement.bean.Teacher;
import org.xhj.laboratorymanagement.service.TeacherService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @RequestMapping("/teacher-appoint")
    public String teacher_app(){
        return "teacher-appoint";
    }

    @RequestMapping("/")
    public String teacher(){
        return "teacher";
    }

    @RequestMapping("/selectTeacher")
    public String selectTeacher(String teacher_name, String teacher_pwd, HttpSession session){

        Teacher teacher=teacherService.selectTeacher(teacher_name,teacher_pwd);
        if (teacher.getTeacher_name().equals(teacher_name) && teacher.getTeacher_pwd().equals(teacher_pwd)){
            session.setAttribute("teacher_name",teacher.getTeacher_name());
            session.setAttribute("teacher",teacher);
            session.setAttribute("teacher_id",teacher.getTeacher_id());
        }else{
            return "login";
        }
        return "redirect:/appointment/index_tea";
    }

    @RequestMapping("/findAllTeacher")
    @ResponseBody
    public ResultMap<List<Teacher>> findTeacher(@RequestParam(defaultValue = "1",value = "page") Integer page,
                                            @RequestParam(defaultValue = "10",value = "limit") Integer limit){
        PageHelper.startPage(page,limit);
        List<Teacher> teachers=teacherService.findTeacher();
        PageInfo<Teacher> pageInfo=new PageInfo<Teacher>(teachers,limit);
        int count=teacherService.selectCount();
        return new ResultMap<List<Teacher>>(0,"",count,pageInfo.getList());
    }

    @RequestMapping("/addTeacher")
    @ResponseBody
    public String addTeacher(Teacher teacher){

        int ok=teacherService.insertTeacher(teacher);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/updateTeacher")
    @ResponseBody
    public String updateTeacher(Teacher teacher){
        System.out.println(teacher);
        int ok=teacherService.updateTeacher(teacher);
        System.out.print(ok);
        if (ok>0) {
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/deleteTeacher")
    @ResponseBody
    public String deleteTeacher(Integer teacher_id){

        int ok=teacherService.deleteTeacher(teacher_id);
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
