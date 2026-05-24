package com.ajit.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajit.model.Employee;
import com.ajit.service.EmployeeService;

@Component
public class EmployeeAppRunner implements CommandLineRunner {

	@Autowired
	EmployeeService service;

	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("PRESS 1 for : Add Employee");
		System.out.println("PRESS 2 for : Get Employee By ID");
		System.out.println("PRESS 3 for : Get All Employee");
		System.out.println("PRESS 4 for : Modify Employee");
		System.out.println("PRESS 1 for : Remove Employee By Id");
		Scanner sc=new Scanner(System.in);
		int ch=Integer.parseInt(sc.nextLine());
		switch(ch)
		{
		case 1 :
			    System.out.println("How many employee objects you want to save?");
			    int x=Integer.parseInt(sc.nextLine());
			    for(int i=1;i<=x;i++)
			    {
			    	System.out.println("Enter Id");
			    	int id=Integer.parseInt(sc.nextLine());
			    	System.out.println("Enter Name");
			    	String name=sc.nextLine();
			    	System.out.println("Enter Departmet");
			    	String dept=sc.nextLine();
			    	System.out.println("Enter Salary");
			    	double sal=Double.parseDouble(sc.nextLine());
			    	service.save(new Employee(id, name, dept, sal));
			    }
			break;
		}
		

	}

}
