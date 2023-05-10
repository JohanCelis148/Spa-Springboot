package com.sena.sql.lService;

import java.util.List;
import java.util.Optional;

import com.sena.sql.Entity.UsersRoles;

public interface IUsersRolesService {

public List<UsersRoles> all();
    
    public Optional<UsersRoles> findById(Integer id);
    
    public UsersRoles save(UsersRoles userRoles);
    
    public void delete(Integer id);
	
}