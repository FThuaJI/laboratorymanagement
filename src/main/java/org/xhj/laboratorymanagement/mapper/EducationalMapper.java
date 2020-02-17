package org.xhj.laboratorymanagement.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.xhj.laboratorymanagement.bean.Educational;

public interface EducationalMapper {

    @Insert("insert into educational(educational_name,educational_num,educational_pwd) " +
            "values (#{educational_name},#{educational_num},#{educational_pwd})")
    int insertEducational(Educational educational);

    @Select("select * from educational where educational_name = #{educational_name} and educational_pwd = #{educational_pwd}")
    Educational selectEducational(String educational_name,String educational_pwd);
}
