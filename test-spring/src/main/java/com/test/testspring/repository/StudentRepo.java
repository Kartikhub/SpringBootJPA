package com.test.testspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.testspring.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	List<Student> findAll();
	Student findByRollNo(Integer rollNo);
	
}
