package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		
	}
	
	@GetMapping
	public List<Employee> getAllEmps(){
		
		return empService.getAllEmpDetails();
	}
	
	@PostMapping
	public Employee saveNewEmployee(@RequestBody Employee newEmp) {
		
		return empService.addNewEmps(newEmp);
	}
	
	@DeleteMapping("/{empid}")
	public String deleteEmployee(@PathVariable Long empid) {
		
		return empService.deleteEmpById(empid);
	}
	
	@GetMapping("/{empid}")
	public Employee getEmployeeDetails(Long empid) {
		
		return empService.getEmpDetails(empid);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp) {
		
		return empService.updateEmp(emp);
	}
	
	

}
