package com.server.code.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.server.code.dto.Employee;

public class EmployeeDAO {
	
	public static HashMap<Integer, Employee> empsMap = new HashMap<Integer, Employee>();
	
	public static Employee addEmp(Employee emp) {
		empsMap.put(emp.getId(), emp);
		return emp;
	}
	
	public static ArrayList<Employee> getAllEmp() {
		ArrayList<Employee> empsList = new ArrayList<Employee>(empsMap.values());
		return empsList;
	}
}
