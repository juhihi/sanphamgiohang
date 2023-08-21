package com.demogiohang.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demogiohang.entity.*;
public interface RoleDAO extends JpaRepository<Role, String>{
    
}
