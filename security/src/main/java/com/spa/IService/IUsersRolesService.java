package com.spa.IService;

import java.util.List;
import java.util.Optional;

import com.spa.Entity.UsersRoles;

public interface IUsersRolesService {

	public List<UsersRoles> all();
    
    public Optional<UsersRoles> findById(Long id);
    
    public UsersRoles save(UsersRoles usersRoles);
    
    public void delete(Long id);
    
}
