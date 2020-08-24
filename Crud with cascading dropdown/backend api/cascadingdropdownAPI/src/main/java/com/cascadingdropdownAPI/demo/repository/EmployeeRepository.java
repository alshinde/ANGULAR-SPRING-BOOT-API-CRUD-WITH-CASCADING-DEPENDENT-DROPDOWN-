package com.cascadingdropdownAPI.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cascadingdropdownAPI.demo.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

	@Query(value="select e.id,e.name,e.age,e.salary,e.country,e.state,e.city from tbl_employee e where e.id=:empid",nativeQuery = true)
	Employee findOne(@Param("empid") String empid);

}
