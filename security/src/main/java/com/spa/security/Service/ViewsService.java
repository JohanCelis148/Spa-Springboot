package com.spa.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spa.security.Entity.Views;
import com.spa.security.IRepository.IViewsRepository;
import com.spa.security.IService.IViewsService;

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
