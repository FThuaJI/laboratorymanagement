package org.xhj.laboratorymanagement.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xhj.laboratorymanagement.bean.Comment;
import org.xhj.laboratorymanagement.mapper.CommentMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> ListCommentById(Integer laboratory_id) {
        List<Comment> comments = commentMapper.findByLaboratoryIdAndParentCommentNull(laboratory_id);
        return eachComment(comments);
    }

    @Transactional
    public int addComment(Comment comment){
        Integer parent_comment_id = comment.getParentComment().getId();
        int ok;
        if (parent_comment_id != -1){
            comment.setParentComment(commentMapper.findCommentById(parent_comment_id));
            ok = 1;
        }else{
            comment.setParentComment(null);
            ok = -1;
        }
        commentMapper.save(comment);
        return ok;
    }

    private List<Comment> eachComment(List<Comment> comments){
        List<Comment> commentsView = new ArrayList<>();
        for (Comment comment : comments){
            Comment c = new Comment();
            BeanUtils.copyProperties(comment,c);
            commentsView.add(c);
        }
        combineChildren(commentsView);
        return commentsView;
    }

    private void combineChildren(List<Comment> comments){

        for (Comment comment : comments){
            List<Comment> replys1 = comment.getReplyComments();
            for (Comment replys : replys1 ){
                recursively(replys);
            }
            comment.setReplyComments(tempReplys);
            tempReplys = new ArrayList<>();
        }
    }

    private List<Comment> tempReplys = new ArrayList<>();

    private void recursively(Comment comment){
        tempReplys.add(comment);
        if (comment.getReplyComments().size()>0){
            List<Comment> replys = comment.getReplyComments();
            for (Comment reply : replys){
                tempReplys.add(reply);
                if (reply.getReplyComments().size()>0){
                    recursively(reply);
                }
            }
        }
    }
}
