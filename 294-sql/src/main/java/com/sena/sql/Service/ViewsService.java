package com.sena.sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.sql.Entity.Views;
import com.sena.sql.lRepository.IViewsRepository;
import com.sena.sql.lService.IViewsService;

@Service
public class ViewsService implements IViewsService{
	
	@Autowired
	private IViewsRepository repository;

	@Override
	public List<Views> all() {		
		return repository.findAll();
	}

	@Override
	public Optional<Views> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public Views save(Views views) {
		return repository.save(views);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}
}