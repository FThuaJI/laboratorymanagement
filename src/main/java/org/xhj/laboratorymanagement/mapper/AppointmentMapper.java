package org.xhj.laboratorymanagement.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.xhj.laboratorymanagement.bean.Appointment;

import java.util.List;

public interface AppointmentMapper {

    @Select("select count(*) from lab_appointment where laboratory_id = #{laboratory_id}")
    int selectCount(Integer laboratory_id);

    @Select("select * from lab_appointment")
    List<Appointment> selectAppoint();

    @Select("select * from lab_appointment where laboratory_id = #{laboratory_id}")
    List<Appointment> selectAppointment(Integer laboratory_id);

    @Select("select * from lab_appointment where lab_appointment_teacher = #{teacher_name}")
    List<Appointment> selectAppointmentByName(String teacher_name);

    @Select("select * from lab_appointment where student_id = #{student_id}")
    List<Appointment> selectAppointmentById(Integer student_id);

    @Insert("insert into lab_appointment (laboratory_id,student_id,lab_appointment_name,lab_appointment_build,lab_appointment_num,lab_appointment_capacity," +
            "lab_appointment_date,lab_appointment_time,lab_appointment_people,lab_appointment_teacher,lab_appointment_reason," +
            "lab_appointment_type) values (#{laboratory_id},#{student_id},#{lab_appointment_name},#{lab_appointment_build},#{lab_appointment_num},#{lab_appointment_capacity}," +
            "#{lab_appointment_date},#{lab_appointment_time},#{lab_appointment_people},#{lab_appointment_teacher}," +
            "#{lab_appointment_reason},#{lab_appointment_type})")
    int insertAppointment(Appointment appointment);

    @Update("update lab_appointment set lab_appointment_handle = #{lab_appointment_handle} where lab_appointment_id = #{lab_appointment_id}")
    int updateAppointmentById(Integer lab_appointment_id,Integer lab_appointment_handle);
}
