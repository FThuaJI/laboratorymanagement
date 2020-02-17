package org.xhj.laboratorymanagement.service;

import org.springframework.stereotype.Service;
import org.xhj.laboratorymanagement.bean.Educational;
import org.xhj.laboratorymanagement.mapper.EducationalMapper;

import javax.annotation.Resource;

@Service
public class EducationalService {

    @Resource
    private EducationalMapper educationalMapper;

    public int insertEducational(Educational educational){
        return educationalMapper.insertEducational(educational);
    }

    public Educational selectEducational(String educational_name,String educational_pwd){
        return educationalMapper.selectEducational(educational_name,educational_pwd);
    }
}
