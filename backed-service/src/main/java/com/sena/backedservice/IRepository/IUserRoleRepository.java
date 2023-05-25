package com.sena.backedservice.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sena.backedservice.Entity.UserRole;

public interface IUserRoleRepository extends JpaRepository<UserRole, Long>{

}
