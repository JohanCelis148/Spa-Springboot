package com.spa.security.IService;

import java.util.Optional;

import com.spa.security.Entity.Modules;

import java.util.List;

public interface IModulesService {
	
	public List<Modules> all();
    
    public Optional<Modules> findById(Integer id);
    
    public Modules save(Modules modules);
    
    public void delete(Integer id);
	
}
