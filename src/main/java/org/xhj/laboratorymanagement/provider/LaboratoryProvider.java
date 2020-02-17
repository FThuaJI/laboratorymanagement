package org.xhj.laboratorymanagement.provider;

import org.xhj.laboratorymanagement.bean.Laboratory;

public class LaboratoryProvider {

    public String findAllLaboratory(Laboratory laboratory){

        String sql="select * from laboratory ";
        if (laboratory.getLaboratory_name() != null){
            sql += "where laboratory_name like concat ('%',#{laboratory_name},'%') ";
        }
        if (laboratory.getLaboratory_build() != null){
            sql += "and laboratory_build like concat ('%',#{laboratory_build},'%') ";
        }
        if (laboratory.getLaboratory_capacity() != null){
            sql += "and laboratory_capacity between 1 and "+laboratory.getLaboratory_capacity();
        }
        if (laboratory.getLaboratory_use() != null){
            sql += " and laboratory_use like concat ('%',#{laboratory_use},'%')";
        }
        return sql;
    }
}
