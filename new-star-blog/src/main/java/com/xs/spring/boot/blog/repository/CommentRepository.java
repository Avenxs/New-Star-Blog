package com.xs.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xs.spring.boot.blog.domain.Comment;

/**
 * Comment Repository 接口. 
 * 
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
