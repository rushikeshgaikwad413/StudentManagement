package com.springboot.studentms.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.studentms.entity.Student;
import com.springboot.studentms.repository.StudentRepository;
import com.springboot.studentms.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Long id, Student updatedStudent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	
}
