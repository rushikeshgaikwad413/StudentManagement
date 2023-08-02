package com.springboot.studentms.service;

import org.springframework.stereotype.Service;

import com.springboot.studentms.entity.Student;
import java.util.List;

@Service
public interface StudentService {

	List<Student> getAllStudents();

	Student updateStudent();

	
    void createStudent(Student student);

    void updateStudent(Long id, Student updatedStudent);

    void deleteStudent(Long id);

	Student saveStudent(Student student);

	Student updateStudent(Student student);
	


}
