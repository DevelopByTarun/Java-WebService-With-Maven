package com.employee.server.code;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.employee.dto.Employee;

@WebService
public interface EmployeeWS {
	
	// for add employee
	@WebMethod
	public boolean addEmployee(Employee e);
	
	// for delete employee
	@WebMethod
	public boolean deleteEmployee(int id);
	
	// for get employee
	@WebMethod
	public Employee getEmployeeById(int id);
	
	// for get employees
	@WebMethod
	public Employee[] getAllEmployees();
}
