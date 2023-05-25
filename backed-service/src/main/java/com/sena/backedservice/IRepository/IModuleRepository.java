package com.sena.backedservice.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.backedservice.Entity.Module;


public interface IModuleRepository extends JpaRepository<Module, Long>  {

}
