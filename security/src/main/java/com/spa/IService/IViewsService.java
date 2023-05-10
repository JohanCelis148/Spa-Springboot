package com.spa.IService;

import java.util.List;
import java.util.Optional;

import com.spa.Entity.Views;

public interface IViewsService {
	
	public List<Views> all();
    
    public Optional<Views> findById(Long id);
    
    public Views save(Views views);
    
    public void delete(Long id);
    
}
