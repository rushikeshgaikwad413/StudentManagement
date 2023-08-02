package com.springboot.studentms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.studentms.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long>{

	List<Student> findAll();

	
}

