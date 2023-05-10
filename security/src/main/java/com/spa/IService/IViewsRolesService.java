package com.spa.IService;

import java.util.List;
import java.util.Optional;

import com.spa.Entity.ViewsRoles;

public interface IViewsRolesService {

	public List<ViewsRoles> all();
    
    public Optional<ViewsRoles> findById(Long id);
    
    public ViewsRoles save(ViewsRoles viewsRoles);
    
    public void delete(Long id);
    
}
