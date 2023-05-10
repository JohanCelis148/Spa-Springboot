package com.sena.sql.lService;

import java.util.List;
import java.util.Optional;

import com.sena.sql.Entity.Roles;

public interface IRolesService {

public List<Roles> all();
    
    public Optional<Roles> findById(Integer id);
    
    public Roles save(Roles modules);
    
    public void delete(Integer id);
	
}