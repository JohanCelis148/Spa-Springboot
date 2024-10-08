package com.spa.security.IService;

import java.util.List;
import java.util.Optional;

import com.spa.security.Entity.ViewsRoles;

public interface IViewsRolesService {

	public List<ViewsRoles> all();
    
    public Optional<ViewsRoles> findById(Integer id);
    
    public ViewsRoles save(ViewsRoles viewsRoles);
    
    public void delete(Integer id);
	
}
