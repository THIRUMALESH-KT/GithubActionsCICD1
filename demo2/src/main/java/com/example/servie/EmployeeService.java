package com.example.servie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.employee;
import com.example.repo.ExampleRepo;

@Service
public class EmployeeService {

	@Autowired
	private ExampleRepo repo;
	
	public Object create(employee emp) {
		return repo.save(emp);
		
	}
	public Object read() {
		return repo.findAll();
	}
}

