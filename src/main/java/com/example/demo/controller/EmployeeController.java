package com.example.demo.controller;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeReq;

@RestController
public class EmployeeController {
	
	@Autowired
	AlienRepo repo;

//	@RequestMapping("/")
//	public String home()
//	{
//		return "home.jsp";
//	}
	
	
	@PostMapping(value="/addAlien", consumes=MediaType.APPLICATION_JSON_VALUE)
	//@CrossOrigin("http:://localhost:3000")
	public ResponseEntity<Employee> addAlien(@RequestBody Employee employee){
		Employee emp = repo.save(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
}
