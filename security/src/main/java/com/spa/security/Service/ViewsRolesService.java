package com.spa.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spa.security.Entity.ViewsRoles;
import com.spa.security.IRepository.IViewsRolesRepository;
import com.spa.security.IService.IViewsRolesService;

@Service
public class ViewsRolesService implements IViewsRolesService{

	@Autowired
	private IViewsRolesRepository repository;
	
	@Override
	public List<ViewsRoles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<ViewsRoles> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public ViewsRoles save(ViewsRoles viewsRoles) {
		return repository.save(viewsRoles);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
