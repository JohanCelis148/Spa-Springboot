package com.spa.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.security.Entity.Views;

public interface IViewsRepository extends JpaRepository<Views, Integer>{

}
