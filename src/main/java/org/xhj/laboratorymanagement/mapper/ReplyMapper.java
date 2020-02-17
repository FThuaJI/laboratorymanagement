package org.xhj.laboratorymanagement.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.xhj.laboratorymanagement.bean.Reply;

import java.util.List;

public interface ReplyMapper {

    @Select("select * from reply where laboratory_id = #{laboratory_id}")
    List<Reply> findReply(Integer laboratory_id,Integer comment_id);

    @Insert("insert into reply(reply_id,parent_comment_id,reply_userId,reply_username,reply_content," +
            "reply_time) values (#{reply_id},#{parent_comment_id},#{reply_userId},#{reply_username}," +
            "#{reply_content},#{reply_time})")
    int addReply(Reply reply);
}
