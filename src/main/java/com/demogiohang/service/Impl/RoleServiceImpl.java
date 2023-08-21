package com.demogiohang.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demogiohang.dao.RoleDAO;
import com.demogiohang.entity.Role;
import com.demogiohang.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleDAO dao;

	public List<Role> findAll() {
		return dao.findAll();
	}
}
