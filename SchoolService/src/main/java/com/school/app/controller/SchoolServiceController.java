package com.school.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/schoolDetails")
public class SchoolServiceController {

	
	@Autowired
	RestTemplate restTemplate;
	
	//static Map<Student, List<Student>> map;
}
