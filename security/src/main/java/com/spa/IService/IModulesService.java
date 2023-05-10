package com.spa.IService;

import java.util.List;
import java.util.Optional;

import com.spa.Entity.Modules;


public interface IModulesService {

	public List<Modules> all();
    
    public Optional<Modules> findById(Long id);
    
    public Modules save(Modules modules);
    
    public void delete(Long id);
    
}
