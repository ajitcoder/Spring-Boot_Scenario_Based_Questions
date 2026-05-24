package com.ajit.service;

import java.util.List;

import com.ajit.model.Employee;

public interface EmployeeService {

	void save(Employee e);

	Employee read(int id);

	List<Employee> readAll();

	void modify(Employee e);

	void remove(int id);

}
