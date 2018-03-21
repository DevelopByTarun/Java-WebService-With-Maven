package com.server.code;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.server.code.dao.EmployeeDAO;
import com.server.code.dto.Employee;


@Path("employee")
public class MyResource {

	// add employee operation through form
	@Path("/addEmployee")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addEmployee(@DefaultValue("100") @QueryParam("id") int id,
			@DefaultValue("sneha") @QueryParam("name") String name,
			@DefaultValue("delhi") @QueryParam("city") String city,
			@DefaultValue("56745.34") @QueryParam("salary") double salary) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setCity(city);
		emp.setSalary(salary);
		emp = EmployeeDAO.addEmp(emp);
		return Response.status(200).entity(emp).build();
	}
	
	// get employee by id operation through form
	@Path("/getEmployee")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeById(@DefaultValue("101") @QueryParam("id") int id) {
		Employee employee = EmployeeDAO.getEmpById(id);
		return Response.status(200).entity(employee).build();
	}
	
	// get all employees operation
	@Path("/getAllEmployees")
	@GET
	public Response getAllEmployees() {
		ArrayList<Employee> employeesList = EmployeeDAO.getAllEmp();
		return Response.status(200).entity(employeesList.toString()).build();
	}
}
