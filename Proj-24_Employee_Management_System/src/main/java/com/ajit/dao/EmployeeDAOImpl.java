package com.ajit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import com.ajit.model.Employee;

@Repository
@Profile({"dev","prod"})
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	DataSource dataSource;
	
	 @Autowired
	    Environment evn;
	

    
    public void init() {
        String active = evn.getActiveProfiles()[0];

        if (active.equalsIgnoreCase("dev"))
            System.out.println("DEV Activated....for SQL_DB");
        else
            System.out.println("PROD Activated....for MYSQL_DB");
    }
	
	
	@Override
	public void addEmployee(Employee e)  {
		
		try {
			init();
			Connection con = dataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement("insert into employee111(id,name,deptartmet,salary) values(?,?,?,?)");
			stmt.setInt(1, e.getId());
			stmt.setString(2, e.getName());
			stmt.setString(3, e.getDepartment());
			stmt.setDouble(4, e.getSalary());
			int res = stmt.executeUpdate();
			if(res>0)
				System.out.println("DATA ISERTED SUCCESSFULLY......");
			else
				System.out.println("DATA ISERTION FAIL......");
			
		} catch (SQLException e1) {
			System.out.println("TABLE NOT EXIST...");
		}
		
	}

	@Override
	public Employee getEmployee(int id) {
		init();
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		init();
		return null;
	}

	@Override
	public void updateEmployee(Employee e) {
		init();
		
	}

	@Override
	public void deleteEmployee(int id) {
		init();
		
	}

}
