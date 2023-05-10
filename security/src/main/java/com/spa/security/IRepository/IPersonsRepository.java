package com.spa.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.security.Entity.Persons;

public interface IPersonsRepository extends JpaRepository<Persons, Integer>{

}
