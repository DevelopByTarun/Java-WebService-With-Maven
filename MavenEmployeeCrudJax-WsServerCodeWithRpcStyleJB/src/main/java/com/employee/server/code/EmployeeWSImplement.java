package com.employee.server.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import com.employee.dto.Employee;

@WebService(
		portName = "EmployeeCrudPort", 
		serviceName = "EmployeeCrudService",	// calling through service name
		endpointInterface = "com.employee.server.code.EmployeeWS"	
	)
@SOAPBinding(style = Style.RPC)
public class EmployeeWSImplement implements EmployeeWS {
	
	private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	
	// for add employee implementation
	public boolean addEmployee(Employee e) {
		if(employees.get(e.getId()) != null) {
			return false;
		}
		else {
			employees.put(e.getId(), e);
			return true;
		}
	}
	
	// for delete employee implementation
	public boolean deleteEmployee(int id) {
		if(employees.get(id) == null) {
			return false;
		}
		else {
			employees.remove(id);
			return true;
		}
	}
	
	// for get employee by id implementation
	public Employee getEmployeeById(int id) {
		return employees.get(id);
	}
	
	// for get all employees implementation
	public Employee[] getAllEmployees() {
		Set<Integer> ids = employees.keySet();
		Employee[] e = new Employee[ids.size()];
		int i = 0;
		for(Integer id : ids) {
			e[i] = employees.get(id);
			i++;
		}
		return e;
	}
}
