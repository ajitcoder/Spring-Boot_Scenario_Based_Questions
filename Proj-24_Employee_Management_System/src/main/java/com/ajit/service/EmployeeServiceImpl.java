package com.ajit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.dao.EmployeeDAO;
import com.ajit.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO dao;
	
	@Override
	public void save(Employee e) {
		dao.addEmployee(e);
	}

	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub

	}

}
