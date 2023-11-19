package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.employee;

public interface ExampleRepo extends JpaRepository<employee, Long> {

}
