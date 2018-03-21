package com.server.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.server.code.dto.Employee;


@Path("employeeWebService")
public class MyResource {

	private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	
	static {
		
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("tarun");
		e1.setDesig("fullstackDeveloper");
		e1.setSalary(98908.34);
		e1.setState("sydney");
		e1.setCountry("australia");
		e1.setPincode(977989);
		employees.put(e1.getId(), e1);
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("varun");
		e2.setDesig("backend");
		e2.setSalary(34323.67);
		e2.setState("delhi");
		e2.setCountry("india");
		e2.setPincode(110089);
		employees.put(e2.getId(), e2);
		
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("kim");
		e3.setDesig("developer");
		e3.setSalary(53743.34);
		e3.setState("auckland");
		e3.setCountry("newzealand");
		e3.setPincode(3635300);
		employees.put(e3.getId(), e3);
		
		Employee e4 = new Employee();
		e4.setId(104);
		e4.setName("rim");
		e4.setDesig("tester");
		e4.setSalary(345423.99);
		e4.setState("sanporda");
		e4.setCountry("brazil");
		e4.setPincode(32234);
		employees.put(e4.getId(), e4);
	}
	
	@Path("/getEmployees")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<Employee> getAllEmployeesXML() {
    	ArrayList<Employee> empList = new ArrayList<Employee>(employees.values());
    	return empList;
    }
	
	@Path("/getEmployee/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployeeByIdXML(@PathParam("id") int id) {
		Employee emp = employees.get(id);
		return emp;
	}
}
