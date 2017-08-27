package com.xs.spring.boot.blog.service;

import com.xs.spring.boot.blog.domain.Authority;

/**
 * Authority 服务接口.
 * 
 */
public interface AuthorityService {
	/**
	 * 根据ID查询 Authority
	 * @param id
	 * @return
	 */
    Authority getAuthorityById(Long id);
}
