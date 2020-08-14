package com.springboot.demospringboot.service;

import org.springframework.stereotype.Service;

import com.springboot.demospringboot.entity.Employee;

@Service
public interface EmployeeService {

	boolean authenticate(String username, String password);
	Employee getEmployeebyId(int empid);
}
