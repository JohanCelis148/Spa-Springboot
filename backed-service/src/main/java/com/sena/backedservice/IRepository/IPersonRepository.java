package com.sena.backedservice.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.backedservice.Entity.Person;


public interface IPersonRepository extends JpaRepository<Person, Long>{

}
