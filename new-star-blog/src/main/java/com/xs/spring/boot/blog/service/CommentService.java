package com.xs.spring.boot.blog.service;

import com.xs.spring.boot.blog.domain.Comment;

/**
 * Comment Service接口.
 * 
 */
public interface CommentService {

	/**
     * 根据id获取 Comment
     * @param id
     * @return
     */
    Comment getCommentById(Long id);
    /**
     * 删除评论
     * @param id
     * @return
     */
    void removeComment(Long id);
}
