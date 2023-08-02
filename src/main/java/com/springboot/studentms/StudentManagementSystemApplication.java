package com.springboot.studentms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.studentms.entity.Student;
import com.springboot.studentms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
    
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Ashish", "Hinge", "ashishhinge@gmail.com");
		studentRepository.save(student1);
		
		
		Student student2 = new Student("Ajay", "Ghumre", "ajayghumre@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Vivek", "Jadhav", "vivekj@gmail.com");
		studentRepository.save(student3);
		
		
		
	}

}