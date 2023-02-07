package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {

	List<Employee> getAllEmpDetails();

	Employee addNewEmps(Employee newEmp);

	String deleteEmpById(Long id);

	Employee getEmpDetails(Long empid);

	Employee updateEmp(Employee emp);

}
