package com.demogiohang.service;

import java.util.List;

import com.demogiohang.entity.Authority;

public interface AuthorityService {
	public List<Authority> findAll();

	public Authority create(Authority auth);

	public void delete(Integer auth);

	public List<Authority> findAuthoritiesOfAdministrators();
}
