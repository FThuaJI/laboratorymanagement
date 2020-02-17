package org.xhj.laboratorymanagement.service;

import org.springframework.stereotype.Service;
import org.xhj.laboratorymanagement.bean.Reply;
import org.xhj.laboratorymanagement.mapper.ReplyMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReplyService {

    @Resource
    private ReplyMapper replyMapper;

    public List<Reply> findReply(Integer laboratory_id,Integer comment_id){
        return replyMapper.findReply(laboratory_id,comment_id);
    }

    public int addReply(Reply reply){
        return replyMapper.addReply(reply);
    }
}
