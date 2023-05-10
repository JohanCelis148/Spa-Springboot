package com.sena.sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.sql.Entity.UsersRoles;
import com.sena.sql.lRepository.IUserRolesRepository;
import com.sena.sql.lService.IUsersRolesService;
@Service
public class UserRolesService implements IUsersRolesService{
	
	@Autowired
	private IUserRolesRepository repository;

	@Override
	public List<UsersRoles> all() {		
		return repository.findAll();
	}

	@Override
	public Optional<UsersRoles> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public UsersRoles save(UsersRoles userRoles) {
		return repository.save(userRoles);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}
}