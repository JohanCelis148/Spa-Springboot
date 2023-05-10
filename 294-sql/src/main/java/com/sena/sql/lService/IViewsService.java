package com.sena.sql.lService;

import java.util.List;
import java.util.Optional;

import com.sena.sql.Entity.Views;

public interface IViewsService {
	
	public List<Views> all();
    
    public Optional<Views> findById(Integer id);
    
    public Views save(Views views);
    
    public void delete(Integer id);

}