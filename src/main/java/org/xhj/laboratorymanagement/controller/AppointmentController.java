package org.xhj.laboratorymanagement.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xhj.laboratorymanagement.bean.Appointment;
import org.xhj.laboratorymanagement.bean.ResultMap;
import org.xhj.laboratorymanagement.service.AppointmentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    @Resource
    private AppointmentService appointmentService;

    @RequestMapping("/")
    public String appoint(){
        return "appointment";
    }

    @RequestMapping("/index")
    public String index_stu(){
        return "index-stu";
    }

    @RequestMapping("/index_tea")
    public String index_tea(){
        return "index-tea";
    }

    @RequestMapping("/lab_stu")
    public String lab_appoint(){
        return "laboratory-stu";
    }

    @RequestMapping("/selectAppointment")
    public String selectAppoint(Integer laboratory_id, Model model, HttpSession session){

        session.setAttribute("laboratory_id",laboratory_id);
        List<Appointment> appointments=appointmentService.selectAppointment(laboratory_id);
        System.out.println(2);
        model.addAttribute("appointments",appointments);
        return "appointment";
    }

    @RequestMapping("/selectAppoint")
    @ResponseBody
    public ResultMap<List<Appointment>> selectAppoint(@RequestParam(defaultValue = "1",value = "page") Integer page,
                                                      @RequestParam(defaultValue = "10",value = "limit") Integer limit){
        PageHelper.startPage(page,limit);
        List<Appointment> appointmentList=appointmentService.selectAppoint();
        PageInfo<Appointment> pageInfo=new PageInfo<Appointment>(appointmentList,limit);
        int count=pageInfo.getSize();
        return new ResultMap<List<Appointment>>(0,"",count,pageInfo.getList());
    }

    @RequestMapping("/selectAppointByName")
    @ResponseBody
    public ResultMap<List<Appointment>> selectAppointByName(@RequestParam(defaultValue = "1",value = "page") Integer page,
                                                           @RequestParam(defaultValue = "10",value = "limit") Integer limit,
                                                            String teacher_name){
        PageHelper.startPage(page,limit);
        List<Appointment> appointmentList=appointmentService.selectAppointmentByName(teacher_name);
        PageInfo<Appointment> pageInfo=new PageInfo<Appointment>(appointmentList,limit);
        int count=pageInfo.getSize();
        return new ResultMap<List<Appointment>>(0,"",count,pageInfo.getList());
        }

    @RequestMapping("/selectAppointById")
    public String selectAppointById(Integer student_id, Model model){

        List<Appointment> appointments=appointmentService.selectAppointmentById(student_id);
        model.addAttribute("appointments",appointments);
        return "student-appoint";
    }

    @RequestMapping("/insertAppointment")
    @ResponseBody
    public String insertAppoint(Appointment appointment){

        if (appointment.getLab_appointment_class() == null){
            appointment.setLab_appointment_type(1);
        }else {
            appointment.setLab_appointment_type(2);
        }
        System.out.println(appointment);
        int ok = appointmentService.insertAppointment(appointment);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/updateById")
    @ResponseBody
    public String updateAppointById(Integer lab_appointment_id,Integer lab_appointment_handle){

        int ok = appointmentService.updateAppointmentById(lab_appointment_id,lab_appointment_handle);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }
}
