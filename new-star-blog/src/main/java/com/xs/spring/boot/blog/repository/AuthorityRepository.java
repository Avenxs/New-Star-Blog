package com.xs.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xs.spring.boot.blog.domain.Authority;

/**
 * Authority 仓库.
 * 
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
