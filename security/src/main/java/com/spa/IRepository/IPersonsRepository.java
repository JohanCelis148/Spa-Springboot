package com.spa.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.Entity.Persons;

public interface IPersonsRepository extends JpaRepository<Persons, Long>{

}
