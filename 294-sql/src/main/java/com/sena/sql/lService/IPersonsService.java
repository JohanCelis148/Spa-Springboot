package com.sena.sql.lService;

import java.util.List;
import java.util.Optional;

import com.sena.sql.Entity.Persons;

public interface IPersonsService {
		
	public List<Persons> all();
    
    public Optional<Persons> findById(Integer id);
    
    public Persons save(Persons persons);
    
    public void delete(Integer id);
    
}