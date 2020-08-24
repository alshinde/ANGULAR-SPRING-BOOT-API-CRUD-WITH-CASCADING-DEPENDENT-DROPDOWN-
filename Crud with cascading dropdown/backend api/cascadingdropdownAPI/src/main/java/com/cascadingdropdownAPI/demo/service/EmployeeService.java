package com.cascadingdropdownAPI.demo.service;

import java.util.List;
import java.util.Optional;

import com.cascadingdropdownAPI.demo.model.Employee;



public interface EmployeeService {

	public Employee registerEMployee(Employee emp);
	
	public List<Employee> getAllEMployees();
	
	public Employee getEmployeeById(int empid);
	
	public void deleteEmployeeById(int empid);
}
