package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

public interface AlienRepo extends CrudRepository<Employee, Integer>{

}
