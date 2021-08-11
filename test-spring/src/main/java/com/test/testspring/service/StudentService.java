package com.test.testspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.testspring.entity.Student;
import com.test.testspring.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> getStudentList(){
		return studentRepo.findAll();
	}
	
	public Student getStudentById(Integer rollNo) {
		return studentRepo.findByRollNo(rollNo);
	}
	
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}

}
