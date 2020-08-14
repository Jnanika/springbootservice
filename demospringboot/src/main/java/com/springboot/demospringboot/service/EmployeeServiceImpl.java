package com.springboot.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demospringboot.entity.Employee;
import com.springboot.demospringboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired

	EmployeeRepository employeeRepository;
	
	@Override
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		
		Employee employee = employeeRepository.findByUsernameAndPassword(username, password);
		if(employee == null)
		{
			return false;
		}
		return true;
	}

	@Override
	public Employee getEmployeebyId(int empid) {
		// TODO Auto-generated method stub
		
		return employeeRepository.findByEmpid(empid);
		
	}
}
