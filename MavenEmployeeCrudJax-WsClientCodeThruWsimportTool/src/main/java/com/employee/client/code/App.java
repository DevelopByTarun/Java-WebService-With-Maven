package com.employee.client.code;

import java.util.Scanner;
import java.util.ArrayList;
import com.employee.server.code.Employee;
import com.employee.server.code.EmployeeCrudService;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) {
    	EmployeeCrudService emps = new EmployeeCrudService();
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("");
    		System.out.println("1. Add Employee");
    		System.out.println("2. Delete Employee");
    		System.out.println("3. Get Employee By Id");
    		System.out.println("4. Get All Employees");
    		System.out.println("5. Exit");
    		System.out.print("Enter The Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter Employee Id :: ");
    			int id = sc.nextInt();
    			
    			System.out.print("Enter Employee Name :: ");
    			String name = sc.next();
    			
    			System.out.print("Enter Employee City :: ");
    			String city = sc.next();
    			
    			System.out.print("Enter Employee Salary :: ");
    			double salary = sc.nextDouble();
    			
    			Employee e = new Employee();
    			e.setId(id);
    			e.setName(name);
    			e.setCity(city);
    			e.setSalary(salary);
    			
    			boolean status = emps.getEmployeeCrudPort().addEmployee(e);
    			if(status == true) {
    				System.out.println("Employee Added Successfully");
    			}
    			else {
    				System.out.println("Unable To Add Employee");
    			}
    		}
    		else if(choice == 2) {
    			System.out.print("Enter Employee Id :: ");
    			int id = sc.nextInt();
    			
    			boolean status = emps.getEmployeeCrudPort().deleteEmployee(id);
    			if(status == true) {
    				System.out.println("Employee Deleted Successfully");
    			}
    			else {
    				System.out.println("Unable To Delete Employee");
    			}
    		}
    		else if(choice == 3) {
    			System.out.print("Enter Employee Id :: ");
    			int id = sc.nextInt();
    			
    			Employee employee = emps.getEmployeeCrudPort().getEmployeeById(id);
    			if(employee != null) {
    				System.out.println(employee);
    			}
    			else {
    				System.out.println("Employee Not Found");
    			}
    		}
    		else if(choice == 4) {
    			ArrayList<Employee> emp = (ArrayList<Employee>) emps.getEmployeeCrudPort().getAllEmployees();
    			if(emp != null) {
    				for(Employee empList : emp) {
    					System.out.println("Employee Id Is :: "+empList.getId());
    					System.out.println("Employee Name Is :: "+empList.getName());
    					System.out.println("Employee City Is :: "+empList.getCity());
    					System.out.println("Employee Salary Is :: "+empList.getSalary());
    					System.out.println("");
    				}
    			}
    			else {
    				System.out.println("No Employees Found");
    			}
    		}
    		else {
    			System.out.println("Goodbye....!!");
    			return;
    		}
    	}	
    }
}
