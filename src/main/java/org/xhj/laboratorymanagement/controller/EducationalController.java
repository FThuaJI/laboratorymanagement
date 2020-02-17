package org.xhj.laboratorymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xhj.laboratorymanagement.bean.Educational;
import org.xhj.laboratorymanagement.service.EducationalService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/educational")
public class EducationalController {

    @RequestMapping("/educational-appoint")
    public String educational_app(){
        return "educational-appoint";
    }

    @Resource
    private EducationalService educationalService;

    @RequestMapping("/selectEducational")
    public String selectEducational(String educational_name, String educational_pwd, HttpSession session){

        Educational educational=educationalService.selectEducational(educational_name,educational_pwd);
        if (educational.getEducational_name().equals(educational_name) && educational.getEducational_pwd().equals(educational_pwd)){
            session.setAttribute("educational_name",educational.getEducational_name());
            session.setAttribute("educational",educational);
        }else{
            return "login";
        }
        return "redirect:/laboratory/index";
    }

    @RequestMapping("/addEducational")
    @ResponseBody
    public String addEducational(Educational educational){

        int ok=educationalService.insertEducational(educational);
        if (ok>0){
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
