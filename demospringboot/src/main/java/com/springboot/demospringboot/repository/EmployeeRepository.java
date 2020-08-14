package com.springboot.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demospringboot.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Employee findByUsernameAndPassword(String username, String password);
	
	Employee findByEmpid(int empid);

}
