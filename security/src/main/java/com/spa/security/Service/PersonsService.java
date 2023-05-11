package com.spa.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spa.security.Entity.Persons;
import com.spa.security.IRepository.IPersonsRepository;
import com.spa.security.IService.IPersonsService;

@Service
public class PersonsService implements IPersonsService{

	@Autowired
	private IPersonsRepository repository;
	
	@Override
	public List<Persons> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Persons> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Persons save(Persons persons) {
		return repository.save(persons);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
