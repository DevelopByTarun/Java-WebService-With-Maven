package com.server.code;

import java.util.ArrayList;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.server.code.dao.EmployeeDAO;
import com.server.code.dto.Employee;


@Path("employee")
public class MyResource {

	// add employee operation through form
	@Path("/addEmployee")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response addEmployee(@FormParam("id") int id,
			@FormParam("name") String name,
			@FormParam("city") String city,
			@FormParam("salary") double salary) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setCity(city);
		emp.setSalary(salary);
		emp = EmployeeDAO.addEmp(emp);
		return Response.status(200).entity(emp).build();
	}
	
	// get all employees operation
	@Path("/getAllEmployees")
	@GET
	public Response getAllEmployees() {
		ArrayList<Employee> employeesList = EmployeeDAO.getAllEmp();
		return Response.status(200).entity(employeesList.toString()).build();
	}
}
