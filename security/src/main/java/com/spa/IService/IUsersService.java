package com.spa.IService;

import java.util.List;
import java.util.Optional;

import com.spa.Entity.Users;

public interface IUsersService {
public List<Users> all();
    
    public Optional<Users> findById(Long id);
    
    public Users save(Users users);
    
    public void delete(Long id);
}
