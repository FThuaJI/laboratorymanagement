package org.xhj.laboratorymanagement.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.xhj.laboratorymanagement.bean.Comment;

import java.util.List;

@Repository
@Transactional
public interface CommentMapper extends JpaRepository<Comment,Integer> {

    List<Comment> findByLaboratoryIdAndParentCommentNull(Integer laboratory_id);

    Comment findCommentById(Integer parent_comment_id);
}
