package com.cascadingdropdownAPI.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="tbl_employee")
public class Employee {

	@Id
	private int id;
	private String name;
	private int age;
	private double salary;
	private int country;
	private int state;
	private int city;
	
}
