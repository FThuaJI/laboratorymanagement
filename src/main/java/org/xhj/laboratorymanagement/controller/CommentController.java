package org.xhj.laboratorymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xhj.laboratorymanagement.bean.Comment;
import org.xhj.laboratorymanagement.service.CommentService;
import org.xhj.laboratorymanagement.service.LaboratoryService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentService commentService;

    @Resource
    private LaboratoryService laboratoryService;

    @RequestMapping("/selectComment")
    public String selectComment(Integer laboratory_id, Model model){

        List<Comment> comments = commentService.ListCommentById(laboratory_id);
        model.addAttribute("comments",comments);
        return "appointment :: commentList";
    }

    @RequestMapping("/insertComment")
    @ResponseBody
    public String insertComment(Comment comment){
        Integer laboratory_id = comment.getLaboratory().getId();
        comment.setLaboratory(laboratoryService.selectLaboratory(laboratory_id));
        comment.setComment_time(new Date());
        int ok = commentService.addComment(comment);
        if (ok == 1){
            return "OK";
        }else {
            return "FALL";
        }
    }

}
