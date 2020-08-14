package com.springboot.demospringboot.controller;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.springboot.demospringboot.dto.LoginRequest;
import com.springboot.demospringboot.entity.Employee;
import com.springboot.demospringboot.service.EmployeeServiceImpl;;

@Controller
/*@ComponentScan	*/
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeService;
	
	@GetMapping("/hello")
	@ResponseBody
	public String getBaseURL() {
		return "Hello there";
	}
	
	@GetMapping("/weather/{state}")
	@ResponseBody
	public String pathvariableeg(@PathVariable("state") String state) {//diff path variable for every component
		
		return "Weather of " +state + "is 72 degree farenheit";
	}
	
	
	@GetMapping("/state")
	@ResponseBody
	public String requestparametereg(@RequestParam("state") String state,@RequestParam("datefor")String datefor) {
		
		return "Weather of " +state + "is 72 degree farenheit" + datefor +"for the date";
	}
	
	@PostMapping("/authentication")
	
	public @ResponseBody boolean authenticateuser(@RequestBody LoginRequest loginrequest) {
		return employeeService.authenticate(loginrequest.getUsername(), loginrequest.getPassword());
		
	}

	/*@GetMapping("/employeebyid")
	
	public Employee requestparametereg(@RequestParam("empid") int empid) {
		
		return employeeService.getEmployeebyId(empid);
	}
	*/
	
	@RequestMapping(value = "/employeebyid", method = RequestMethod.GET, produces = {"application/json"})
    public @ResponseBody Employee findByEmployeeByID(@PathParam("empid") int empid) {
		return employeeService.getEmployeebyId(empid);
	}
}

