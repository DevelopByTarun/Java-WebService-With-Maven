package com.server.code.service;

import java.util.ArrayList;
import java.util.HashMap;
import com.server.code.dto.Student;

public class StudentService {
	
	private static HashMap<Integer, Student> students = new HashMap<Integer, Student>();
	
	// add student 
	public static Student addStud(Student stud) {
		students.put(stud.getId(), stud);
		return stud;
	}
	
	// read all students
	public static ArrayList<Student> getAllStud() {
		ArrayList<Student> studsList = new ArrayList<Student>(students.values());
		return studsList;
	}
	
	// read student by id
	public static Student getStudById(int id) {
		Student stud = students.get(id);
		return stud;
	}
	
	// delete student
	public static Student deleteStud(int id) {
		Student studDel = students.remove(id);
		return studDel;
	}
	
	// update student dosen't work
//	public static Student updateStud(Student stud) {
//		if(students.get(stud.getId()) != null) {
//			students.get(stud.getId()).setName(stud.getName());
//			students.get(stud.getId()).setAge(stud.getAge());
//			students.get(stud.getId()).setCity(stud.getCity());
//		}
//		else {
//			students.put(stud.getId(), stud);
//		}
//		return students.get(stud.getId());
//	}
}
