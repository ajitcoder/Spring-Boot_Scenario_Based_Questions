package com.ajit.dao;

import java.util.List;

import com.ajit.model.Employee;

public interface EmployeeDAO {

	void addEmployee(Employee e);

	Employee getEmployee(int id);

	List<Employee> getAllEmployees();

	void updateEmployee(Employee e);

	void deleteEmployee(int id);
}
