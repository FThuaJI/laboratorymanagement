package org.xhj.laboratorymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xhj.laboratorymanagement.bean.Reply;
import org.xhj.laboratorymanagement.service.ReplyService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/reply")
public class ReplyController {

    @Resource
    private ReplyService replyService;

    @RequestMapping("/selectReply")
    public String selectReply(Integer laboratory_id,Integer comment_id, Model model){

        System.out.println(1);
        List<Reply> replies = replyService.findReply(laboratory_id,comment_id);
        System.out.println(3);
        model.addAttribute("replies",replies);
        return "appointment :: commentList";
    }
}
