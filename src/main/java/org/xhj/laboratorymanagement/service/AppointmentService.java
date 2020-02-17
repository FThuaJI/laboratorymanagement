package org.xhj.laboratorymanagement.service;

import org.springframework.stereotype.Service;
import org.xhj.laboratorymanagement.bean.Appointment;
import org.xhj.laboratorymanagement.mapper.AppointmentMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppointmentService {

    @Resource
    private AppointmentMapper appointmentMapper;

    public int selectCount(Integer laboratory_id){
        return appointmentMapper.selectCount(laboratory_id);
    }

    public List<Appointment> selectAppoint(){
        return appointmentMapper.selectAppoint();
    }

    public List<Appointment> selectAppointment(Integer laboratory_id){
        return appointmentMapper.selectAppointment(laboratory_id);
    }

    public List<Appointment> selectAppointmentById(Integer student_id){
        return appointmentMapper.selectAppointmentById(student_id);
    }

    public List<Appointment> selectAppointmentByName(String teacher_name){
        return appointmentMapper.selectAppointmentByName(teacher_name);
    }

    public int insertAppointment(Appointment appointment){
        return appointmentMapper.insertAppointment(appointment);
    }

    public int updateAppointmentById(Integer lab_appointment_id,Integer lab_appointment_handle){
        return appointmentMapper.updateAppointmentById(lab_appointment_id,lab_appointment_handle);
    }
}
