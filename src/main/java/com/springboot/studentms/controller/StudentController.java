	package com.springboot.studentms.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.studentms.entity.Student;
import com.springboot.studentms.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	// handler method to handle the list students and return mode and view
	// http://localhost:8080/students
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("Students", studentService.getAllStudents());
		return "students";
		
		
	}
	
	//DELETE http://localhost:8080/students/1

	@DeleteMapping("/students/{id}")
	@ResponseBody
	public String deleteStudent(@PathVariable("id") Long id) {
	    // Assuming Student class is defined and contains necessary student information
	    studentService.deleteStudent(id);
	    return "Student deleted successfully!";
	}
	

	// ...

	@PutMapping("/students/{id}")
	@ResponseBody
	public String updateStudent(@RequestParam("id") Long id, @RequestBody Student updatedStudent) {
	    // Assuming Student class is defined and contains necessary student information
	    studentService.updateStudent(id, updatedStudent);
	    return "Student updated successfully!";
	}
	
	
	//POST http://localhost:8080/students
        
//	{
//	    "id": 1,
//	    "firstname": "John ",
 //       "lastname": "doe"	
//	    "email": john@gmail.com,
//	}

	
	@PostMapping("/students")
	@ResponseBody
	public String createStudent(@RequestBody Student student) {
	    // Assuming Student class is defined and contains necessary student information
	    studentService.createStudent(student);
	    return "Student created successfully!";
	}

	
	

}
