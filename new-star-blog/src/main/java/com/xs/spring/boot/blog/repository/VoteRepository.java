package com.xs.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xs.spring.boot.blog.domain.Vote;

/**
 * Vote Repository接口.
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
