package com.server.code;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.server.code.dto.Employee;

@Path("employee")
public class MyResource {

    @Path("getEmployees")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAllEmployees() {
    	List<Employee> empList = new ArrayList<Employee>();
    	
    	Employee emp1 = new Employee();
    	emp1.setId(101);
    	emp1.setName("tarun");
    	
    	Employee emp2 = new Employee();
    	emp2.setId(102);
    	emp2.setName("varun");
    	
    	Employee emp3 = new Employee();
    	emp3.setId(103);
    	emp3.setName("tim");
    	
    	Employee emp4 = new Employee();
    	emp4.setId(104);
    	emp4.setName("kim");
    	
    	empList.add(emp1);
    	empList.add(emp2);
    	empList.add(emp3);
    	empList.add(emp4);
    	
    	return empList;
    }
}
