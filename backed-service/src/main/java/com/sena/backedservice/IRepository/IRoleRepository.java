package com.sena.backedservice.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.backedservice.Entity.Role;

public interface IRoleRepository extends JpaRepository<Role, Long>{

}
