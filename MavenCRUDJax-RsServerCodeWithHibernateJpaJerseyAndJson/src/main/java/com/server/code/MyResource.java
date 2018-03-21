package com.server.code;

import java.util.ArrayList;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.server.code.dto.EmployeePersistentDTO;
import com.server.code.service.EmployeeService;

@Path("employeeWebService")
public class MyResource {

	// add employee operation
	@Path("/add")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response addEmployee(@FormParam("name") String name,
	    	@FormParam("salary") double salary) {
		EmployeePersistentDTO epDTO = new EmployeePersistentDTO();
		epDTO.setName(name);
		epDTO.setSalary(salary);
		int status = EmployeeService.addEmp(epDTO);
		String output = "Record Inserted Successfully Of Id :: "+status+"";
		return Response.status(200).entity(output).build();
	}
	
	// get All employees operation
	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployees() {
		ArrayList<EmployeePersistentDTO> empsList = EmployeeService.getAllEmp();
		Gson gson = new Gson();
		String json = gson.toJson(empsList);
		return Response.status(200).entity(json).build();
	}
	
	// update employee operation
	@Path("/update")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateEmployee(@FormParam("name") String name,
		    @FormParam("salary") double salary,
		    @FormParam("id") int id) {
		EmployeePersistentDTO epDTO = new EmployeePersistentDTO();
		epDTO.setName(name);
		epDTO.setSalary(salary);
		epDTO.setId(id);
		int status = EmployeeService.updateEmp(epDTO);
		String output = "No Of Record Updated Successfully :: "+status+"";
		return Response.status(200).entity(output).build();
	}
	
	// delete employee operation
	@Path("/delete/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteStudent(@PathParam("id") int id) {
		int status = EmployeeService.deleteEmp(id);
		String output = "No Of Record Deleted Successfully :: "+status+"";
		return Response.status(200).entity(output).build();
	}	
}
