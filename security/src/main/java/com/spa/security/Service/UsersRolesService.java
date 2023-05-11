package com.spa.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spa.security.Entity.UsersRoles;
import com.spa.security.IRepository.IUsersRolesRepository;
import com.spa.security.IService.IUsersRolesService;

@Service
public class UsersRolesService implements IUsersRolesService{

	@Autowired
	private IUsersRolesRepository repository;
	
	@Override
	public List<UsersRoles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<UsersRoles> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public UsersRoles save(UsersRoles usersRoles) {
		return repository.save(usersRoles);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
