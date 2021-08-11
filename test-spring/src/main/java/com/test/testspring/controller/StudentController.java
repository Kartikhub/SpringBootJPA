package com.test.testspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.testspring.entity.Student;
import com.test.testspring.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/getStudentList")
	public List<Student> getStudents() {
		return studentService.getStudentList();
	}
	
	@GetMapping(value = "/StudentById")
	public Student getStudent(@RequestParam Integer rollNo) {
		return studentService.getStudentById(rollNo);
	}
	
	@PostMapping(value = "/saveStudent")
	public String saveStudent(@RequestBody Student student) {
		Student st= new Student();
		st= student;
		studentService.saveStudent(st);
		return st.getStudentName()+" is added to students list";
}
	


}
