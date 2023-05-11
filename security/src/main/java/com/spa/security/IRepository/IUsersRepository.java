package com.spa.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.security.Entity.Users;

public interface IUsersRepository extends JpaRepository<Users, Integer>{

}
