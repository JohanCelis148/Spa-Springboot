package com.spa.security.IService;

import java.util.List;
import java.util.Optional;

import com.spa.security.Entity.UsersRoles;

public interface IUsersRolesService {
	
	public List<UsersRoles> all();
    
    public Optional<UsersRoles> findById(Integer id);
    
    public UsersRoles save(UsersRoles usersRoles);
    
    public void delete(Integer id);
	
}
