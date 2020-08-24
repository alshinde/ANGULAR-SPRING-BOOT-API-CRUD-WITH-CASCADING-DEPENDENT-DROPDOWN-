package com.cascadingdropdownAPI.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cascadingdropdownAPI.demo.model.Employee;
import com.cascadingdropdownAPI.demo.repository.EmployeeRepository;
import com.cascadingdropdownAPI.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee registerEMployee(Employee emp) {
		return this.repository.save(emp);
	}

	@Override
	public List<Employee> getAllEMployees() {
		return this.repository.findAll();
	}

	@Override
	public Employee getEmployeeById(int empid) {
		return this.repository.findOne(String.valueOf(empid));
	}

	@Override
	public void deleteEmployeeById(int empid) {
		this.repository.deleteById(empid);
	}

}
