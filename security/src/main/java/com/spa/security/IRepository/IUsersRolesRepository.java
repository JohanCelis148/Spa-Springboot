package com.spa.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.security.Entity.UsersRoles;

public interface IUsersRolesRepository extends JpaRepository<UsersRoles, Integer>{

}
