package com.crud.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.entity.Student;
import com.crud.repo.StudentRepository;

public class StudentController {
	
	@Autowired
	StudentRepository repository;
	
	@PostMapping("/addStudents")
	private ResponseEntity<?> addStudent(@RequestBody Student student){
		Student student2 = repository.save(student);
		return ResponseEntity.ok(student2);
		
	}

	
	@GetMapping("/getstudent")
	private ResponseEntity<?> getStudents(){
		return (ResponseEntity<?>) repository.findAll();
	}
}
