package org.xhj.laboratorymanagement.service;

import org.springframework.stereotype.Service;
import org.xhj.laboratorymanagement.bean.Laboratory;
import org.xhj.laboratorymanagement.mapper.LaboratoryMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LaboratoryService {

    @Resource
    private LaboratoryMapper laboratoryMapper;

    public int selectCount(){
        return laboratoryMapper.selectCount();
    }

    public Laboratory selectLaboratory(Integer laboratory_id){
        return laboratoryMapper.selectLaboratory(laboratory_id);
    }

    public List<Laboratory> findLaboratory(Laboratory laboratory){
        return laboratoryMapper.findLaboratory(laboratory);
    }

    public int insertLaboratory(Laboratory laboratory){
        return laboratoryMapper.insertLaboratory(laboratory);
    }

    public int updateLaboratory(Laboratory laboratory){
        return laboratoryMapper.updateLaboratory(laboratory);
    }

    public int deleteLaboratory(Integer laboratory_id){
        return laboratoryMapper.deleteLaboratory(laboratory_id);
    }
}
