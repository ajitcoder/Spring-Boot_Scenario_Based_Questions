package com.ajit.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.ajit.controller.EmployeeController;
import com.ajit.model.Employee;

@Component
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	EmployeeController controller;
	
	@Override
	public void run(String... args) throws Exception {
		
		try(
			Scanner sc = new Scanner(System.in);){
			
			while(true) {
				System.out.println("\n***** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM *****");
				System.out.println("Press 1 For Adding New Employee. ");
				System.out.println("Press 2 For Showing All Employees. ");
				System.out.println("Press 3 For Updating Employee Salary. ");
				System.out.println("Press 4 For Deleting Employee. ");
				System.out.println("Press 5 For Exit from Application.");
				
				System.out.print("\nEnter Your Choice: ");
				int choice = Integer.parseInt(sc.next());
				
				switch(choice) {
				
				case 1:
					
					System.out.print("Enter Employee id: ");
					
					int id=Integer.parseInt(sc.next());
					
					System.out.print("Enter Employee Name: ");
					String name = sc.next().toUpperCase();
					
					System.out.print("Enter Employee Department: ");
					String dept = sc.next().toUpperCase();
					
					System.out.print("Enter Employee Salary: ");
					double sal = Double.parseDouble(sc.next());
					
					//Employee emp = new Employee(id,name, dept, sal);
					
					Employee emp=new Employee();
					
					emp.setEId(id);
					emp.setEName(name);
					emp.setDept(dept);
					emp.setSal(sal);
					
					String msg = controller.addEmployee(emp);
					System.out.println(msg);
					break;
					
				case 2:
					System.out.println("\nAll Employee Details: ");
					List<Employee> allEmployees = controller.ViewAllEmployees();
					
					allEmployees.forEach(System.out::println);
					break;
					
				case 3:	
					System.out.print("Enter EID of Employee: ");
					int eId = Integer.parseInt(sc.next());
					
					System.out.print("Enter New Salary: ");
					sal = Double.parseDouble(sc.next());
					
					msg = controller.updateEmployee(eId, sal);
					
					System.out.println(msg);
					break;
					
				case 4:
					System.out.print("Enter EID of Employee: ");
				    eId = Integer.parseInt(sc.next());
				    
				    msg = controller.deleteEmployee(eId);
				    System.out.println(msg);
				    break;
				    
				case 5:
					System.out.println("Thakyou......");
					System.exit(0);
					
				default:
					System.err.println("Invalid Choice...");
				}
				
				//System.out.println("\n");
			}
		}catch (Exception e) {

              System.out.println("Internal Problems: "+e.getMessage());
		}

	}

}

