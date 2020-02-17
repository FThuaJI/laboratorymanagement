package org.xhj.laboratorymanagement.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer comment_userId;
    private String comment_username;
    private String comment_content;
    private Date comment_time;
    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replyComments = new ArrayList<>();
    @ManyToOne
    private Comment parentComment;
    @ManyToOne
    private Laboratory laboratory;

    public Comment() {
    }

    public Comment(Integer comment_id, Integer laboratory_id, Integer parent_comment_id, Integer comment_userId,
                   String comment_username, String comment_content, Date comment_time, List<Comment> replyComments) {
        this.comment_userId = comment_userId;
        this.comment_username = comment_username;
        this.comment_content = comment_content;
        this.comment_time = comment_time;
        this.replyComments = replyComments;
    }

    public Integer getComment_userId() {
        return comment_userId;
    }

    public void setComment_userId(Integer comment_userId) {
        this.comment_userId = comment_userId;
    }

    public String getComment_username() {
        return comment_username;
    }

    public void setComment_username(String comment_username) {
        this.comment_username = comment_username;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    public List<Comment> getReplyComments() {
        return replyComments;
    }

    public void setReplyComments(List<Comment> replyComments) {
        this.replyComments = replyComments;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    public Laboratory getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }

    @Override
    public String toString() {
        return "Comment{" +
                ", comment_userId=" + comment_userId +
                ", comment_username='" + comment_username + '\'' +
                ", comment_content='" + comment_content + '\'' +
                ", comment_time=" + comment_time +
                ", replyComments=" + replyComments +
                ", parentComment=" + parentComment +
                ", laboratory=" + laboratory +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
