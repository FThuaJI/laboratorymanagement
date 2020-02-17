package org.xhj.laboratorymanagement.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xhj.laboratorymanagement.bean.Laboratory;
import org.xhj.laboratorymanagement.bean.ResultMap;
import org.xhj.laboratorymanagement.service.LaboratoryService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/laboratory")
public class LaboratoryController {

    @Resource
    private LaboratoryService laboratoryService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/")
    public String labo(){
        return "laboratory";
    }

    @RequestMapping("/findLaboratory")
    @ResponseBody
    public ResultMap<List<Laboratory>> findLaboratory(@RequestParam(defaultValue = "1",value = "page") Integer page,
                                                      @RequestParam(defaultValue = "10",value = "limit") Integer limit,
                                                      Laboratory laboratory, HttpSession session){
        PageHelper.startPage(page,limit);
        List<Laboratory> laboratoryList=laboratoryService.findLaboratory(laboratory);
        PageInfo<Laboratory> pageInfo=new PageInfo<Laboratory>(laboratoryList,limit);
        int count=laboratoryService.selectCount();
        return new ResultMap<List<Laboratory>>(0,"",count,pageInfo.getList());
    }

        @RequestMapping("/addLaboratory")
        @ResponseBody
        public String addLaboratory(Laboratory laboratory){

            int ok=laboratoryService.insertLaboratory(laboratory);
            if (ok>0){
                return "OK";
            }else{
                return "FALL";
            }
        }

        @RequestMapping("/updateLaboratory")
        @ResponseBody
        public String updateStu(Laboratory laboratory){
            System.out.println(laboratory);
            int ok=laboratoryService.updateLaboratory(laboratory);
            System.out.print(ok);
            if (ok>0) {
                return "OK";
            }else{
                return "FALL";
            }
        }

        @RequestMapping("/deleteLaboratory")
        @ResponseBody
        public String deleteLaboratory(Integer laboratory_id){

            int ok=laboratoryService.deleteLaboratory(laboratory_id);
            if (ok>0) {
                return "OK";
            }else{
                return "FALL";
            }
        }

}
