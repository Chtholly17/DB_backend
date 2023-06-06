package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: CommentMapper
 */

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;

import com.example.database_backend.database.entity.CommentEntity;
@Mapper
public interface CommentMapper {
    // insert comment
    @Insert("insert into comment(id, content, shop, type, resident_id) values(#{commentId}, #{commentContent}, #{commentShop}, #{commentType}, #{commentResidentId})")
    public void insertComment(Integer commentId, String commentContent, String commentShop, String commentType, Integer commentResidentId);

    // delete comment by id
    @Delete("delete from comment where id = #{commentId}")
    public void deleteCommentById(Integer commentId);
}
