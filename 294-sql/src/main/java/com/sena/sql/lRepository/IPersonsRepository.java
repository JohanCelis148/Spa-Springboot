package com.sena.sql.lRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.sql.Entity.Persons;

public interface IPersonsRepository extends JpaRepository<Persons, Integer>{

}