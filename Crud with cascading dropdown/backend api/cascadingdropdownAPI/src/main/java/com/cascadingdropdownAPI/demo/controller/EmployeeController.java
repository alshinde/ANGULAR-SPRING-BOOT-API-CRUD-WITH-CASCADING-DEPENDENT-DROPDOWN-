package com.cascadingdropdownAPI.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cascadingdropdownAPI.demo.model.Employee;
import com.cascadingdropdownAPI.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/register")
	public Employee registerEmployee(@RequestBody Employee emp) {
		return this.employeeService.registerEMployee(emp);
	}
	
	@GetMapping("/list")
	public List<Employee> getAllEmployee(){
		return this.employeeService.getAllEMployees();
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable(value = "id") int empid){
		return ResponseEntity.ok().body(this.employeeService.getEmployeeById(empid));
	}
	
	@DeleteMapping("/employee/{id}")
	public Map<String, Boolean> deleteEmployeeById(@PathVariable(value = "id") int empid) {
		this.employeeService.deleteEmployeeById(empid);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
