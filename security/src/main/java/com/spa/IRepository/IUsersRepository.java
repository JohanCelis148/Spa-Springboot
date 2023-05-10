package com.spa.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.Entity.Users;

public interface IUsersRepository extends JpaRepository<Users, Long>{

}
