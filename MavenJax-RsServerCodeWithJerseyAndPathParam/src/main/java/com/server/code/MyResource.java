package com.server.code;

import com.server.code.dto.Employee;
import com.google.gson.Gson;
import com.server.code.dao.EmployeeDAO;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("employeeWebService")
public class MyResource {
	
	@Path("/addEmployee/{id}/{name}/{desig}/{salary}/{state}/{country}/{pincode}")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public String addEmployee(
    		@PathParam("id") int id, 
    		@PathParam("name") String name,
    		@PathParam("desig") String desig,
    		@PathParam("salary") double salary,
    		@PathParam("state") String state,
    		@PathParam("country") String country,
    		@PathParam("pincode") int pincode) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setDesig(desig);
		emp.setSalary(salary);
		emp.setState(state);
		emp.setCountry(country);
		emp.setPincode(pincode);
		Employee e = EmployeeDAO.addEmployee(emp);
		Gson gson = new Gson();
		String json = gson.toJson(e);
		return json;
	}
	
	@Path("/getEmployee/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployeeById(@PathParam("id") int id) {
		Employee emp = EmployeeDAO.getEmployeeById(id);
		return Response.status(200).entity(emp).build();
	}
}
