package com.spa.IService;

import java.util.List;
import java.util.Optional;
import com.spa.Entity.Persons;

public interface IPersonsService {
	
	public List<Persons> all();
    
    public Optional<Persons> findById(Long id);
    
    public Persons save(Persons persons);
    
    public void delete(Long id);
    
}
