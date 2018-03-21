package com.server.code;

import java.util.ArrayList;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.server.code.dto.Student;
import com.server.code.service.StudentService;

@Path("studentWebService")
public class MyResource {

    // add student operation
	@Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addStudent(@FormParam("id") int id,
    		@FormParam("name") String name,
    		@FormParam("age") int age,
    		@FormParam("city") String city) {
		Student stud = new Student();
		stud.setId(id);
		stud.setName(name);
		stud.setAge(age);
		stud.setCity(city);
		Student addStd = StudentService.addStud(stud);
		return Response.status(200).entity(addStd).build();
	}
	
	// get All students operation
	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllStudents() {
		ArrayList<Student> studsList = StudentService.getAllStud();
		return Response.status(200).entity(studsList).build();
	}
		
	// get student by id operation
	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudentById(@DefaultValue("1") @QueryParam("id") int id) {
		Student studById = StudentService.getStudById(id);
		return Response.status(200).entity(studById).build();
	}
	
	// update student operation dosen't work
//	@Path("/update")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student updateStudent(Student stud) {
//		Student updateStd = StudentService.updateStud(stud);
//		return updateStd;
//	}
	
	// delete student
	@Path("/delete/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteStudent(@PathParam("id") int id) {
		Student deleteStd = StudentService.deleteStud(id);
		return Response.status(200).entity(deleteStd).build();
	}	
}
