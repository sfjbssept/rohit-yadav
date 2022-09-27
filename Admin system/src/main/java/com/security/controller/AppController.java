package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.Employee;

@RestController
public class AppController {

	@GetMapping("/get")
	public String getDetails() {
		return "Get Employee";
	}
	
	/*
	 * @PostMapping("/post") Employee postEmployee(@RequestBody Employee
	 * newEmployee) { retun newEmployee; }
	 */
	
	
	@PutMapping("/put/{name}")
	String putEmployee(@RequestBody Employee newEmployee, @PathVariable String name) {
		return newEmployee.toString() +"Update with name"+name;
		
	}
}
