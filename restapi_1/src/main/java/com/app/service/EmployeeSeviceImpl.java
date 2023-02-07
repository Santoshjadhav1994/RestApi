package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeSeviceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmpDetails() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee addNewEmps(Employee newEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(newEmp);
	}

	@Override
	public String deleteEmpById(Long id) {
		// TODO Auto-generated method stub
		if(empRepo.existsById(id)) {
			empRepo.deleteById(id);
			return "Deleted";
		}
		
		return "Unable to Deleted";
	}

	@Override
	public Employee getEmpDetails(Long empid) {
		// TODO Auto-generated method stub
		return empRepo.findById(empid).orElseThrow(()-> new ResourceNotFoundException("Id not found"));
	}

	@Override
	public Employee updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		if(empRepo.existsById(emp.getId())) {
		    return empRepo.save(emp);
		}
		throw new ResourceNotFoundException("Employee not Found");
		
	}
	
	

}
