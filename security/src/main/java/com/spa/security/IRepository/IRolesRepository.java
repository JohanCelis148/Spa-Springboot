package com.spa.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.security.Entity.Roles;

public interface IRolesRepository extends JpaRepository<Roles, Integer>{

}
