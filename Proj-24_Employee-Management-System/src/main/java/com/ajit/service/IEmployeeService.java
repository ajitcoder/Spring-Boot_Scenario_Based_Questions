package com.ajit.service;

import java.util.List;

import com.ajit.model.Employee;

public interface IEmployeeService {

	public String addNewEmployee(Employee emp) throws Exception;

	public List<Employee> showAllEmployee() throws Exception;
	
	public String updateEmployee(int id, double salary) throws Exception;
	
	public String deleteEmployee(int id) throws Exception;
}
