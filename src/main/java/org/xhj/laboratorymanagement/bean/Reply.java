package org.xhj.laboratorymanagement.bean;

import java.util.Date;

public class Reply {

    private Integer reply_id;
    private Integer laboratory_id;
    private Integer comment_id;
    private Integer reply_userId;
    private String reply_username;
    private String reply_content;
    private Date reply_time;

    public Reply() {
    }

    public Reply(Integer reply_id, Integer laboratory_id, Integer comment_id, Integer reply_userId, String reply_username,
                 String reply_content, Date reply_time) {
        this.reply_id = reply_id;
        this.laboratory_id = laboratory_id;
        this.comment_id = comment_id;
        this.reply_userId = reply_userId;
        this.reply_username = reply_username;
        this.reply_content = reply_content;
        this.reply_time = reply_time;
    }

    public Integer getReply_id() {
        return reply_id;
    }

    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
    }

    public Integer getLaboratory_id() {
        return laboratory_id;
    }

    public void setLaboratory_id(Integer laboratory_id) {
        this.laboratory_id = laboratory_id;
    }

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getReply_userId() {
        return reply_userId;
    }

    public void setReply_userId(Integer reply_userId) {
        this.reply_userId = reply_userId;
    }

    public String getReply_username() {
        return reply_username;
    }

    public void setReply_username(String reply_username) {
        this.reply_username = reply_username;
    }

    public String getReply_content() {
        return reply_content;
    }

    public void setReply_content(String reply_content) {
        this.reply_content = reply_content;
    }

    public Date getReply_time() {
        return reply_time;
    }

    public void setReply_time(Date reply_time) {
        this.reply_time = reply_time;
    }
}
