package org.xhj.laboratorymanagement.mapper;

import org.apache.ibatis.annotations.*;
import org.xhj.laboratorymanagement.bean.Laboratory;
import org.xhj.laboratorymanagement.provider.LaboratoryProvider;

import java.util.List;

public interface LaboratoryMapper {

    @Select("select count(*) from laboratory")
    int selectCount();

    @Select("select * from laboratory where id = #{laboratory_id}")
    Laboratory selectLaboratory(Integer laboratory_id);

    @SelectProvider(type = LaboratoryProvider.class,method = "findAllLaboratory")
    List<Laboratory> findLaboratory(Laboratory laboratory);

    @Insert("insert into laboratory (laboratory_name,laboratory_build,laboratory_num,laboratory_capacity,laboratory_use," +
            "laboratory_describe) values (#{laboratory_name},#{laboratory_build},#{laboratory_num},#{laboratory_capacity}," +
            "#{laboratory_use},#{laboratory_describe})")
    int insertLaboratory(Laboratory laboratory);

    @Update("update laboratory set laboratory_name = #{laboratory_name},laboratory_build = #{laboratory_build}," +
            "laboratory_num = #{laboratory_num},laboratory_capacity = #{laboratory_capacity},laboratory_use = #{laboratory_use}," +
            "laboratory_describe = #{laboratory_describe} where laboratory_id = #{laboratory_id}")
    int updateLaboratory(Laboratory laboratory);

    @Delete("delete from laboratory where laboratory_id = #{laboratory_id}")
    int deleteLaboratory(Integer laboratory_id);


}
