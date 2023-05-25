package com.sena.backedservice.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sena.backedservice.Entity.View;


public interface IViewRepository extends JpaRepository<View, Long>{

	
	
}
