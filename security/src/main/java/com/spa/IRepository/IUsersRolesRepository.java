package com.spa.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.Entity.UsersRoles;

public interface IUsersRolesRepository extends JpaRepository<UsersRoles, Long>{

}
