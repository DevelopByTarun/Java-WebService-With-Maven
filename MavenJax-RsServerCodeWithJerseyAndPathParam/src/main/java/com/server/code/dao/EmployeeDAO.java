package com.server.code.dao;

import java.util.HashMap;
import java.util.Map;
import com.server.code.dto.Employee;

public class EmployeeDAO {
	
	private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	
	// for add employee
	public static Employee addEmployee(Employee e) {
		return employees.put(e.getId(), e);
	}
	
	// for get employee by id
	public static Employee getEmployeeById(int id) {
		return employees.get(id);
	}
}
