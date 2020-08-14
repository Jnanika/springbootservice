package com.springboot.demospringboot.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name= "employee")

public class Employee {
	@Id
	private int empid;
	
	@Column (name="name")
	private String name;
	
	@Column (name="username")
	private String username;
	
	@Column (name="password")
	private String password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	

}
