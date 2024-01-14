package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.LoginDTO;
import com.example.demo.DTO.StudentDTO;
import com.example.demo.response.LoginMessage;
import com.example.demo.services.StudentService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/register")
	public String addstudent(@RequestBody StudentDTO student) {
		 String id = studentService.addStudent(student);
	        return id;
	}
	
	@PostMapping("/studentLogin")
	public ResponseEntity<?> StudentLogin(@RequestBody LoginDTO loginDTO){
		LoginMessage loginMessage = studentService.loginStudent(loginDTO);
		return ResponseEntity.ok(loginMessage);
	}
}
