package com.example.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.employee;
import com.example.servie.EmployeeService;

@RestController
@RequestMapping("/employee")
public class controller {

	@Autowired
	private EmployeeService employeeservice;
	@GetMapping("/welcome")
	public ResponseEntity<Object> welcome(){
		Map<String , Object> map=new LinkedHashMap<String, Object>();
		map.put("message ", "sucess");
		map.put("result " , "welcome to welcome page");
		map.put("status ", HttpStatus.OK);
		return ResponseEntity.ok(map);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Object> create(@RequestBody employee emp){
		Map<String , Object> map=new LinkedHashMap<String, Object>();
		map.put("message ", "sucess");
		map.put("result " , employeeservice.create(emp));
		map.put("status ", HttpStatus.OK);
		return ResponseEntity.ok(map);
	}@PostMapping("/read")
	public ResponseEntity<Object> read(){
		Map<String , Object> map=new LinkedHashMap<String, Object>();
		map.put("message ", "sucess");
		map.put("result " , employeeservice.read());
		map.put("status ", HttpStatus.OK);
		return ResponseEntity.ok(map);
	}
}
