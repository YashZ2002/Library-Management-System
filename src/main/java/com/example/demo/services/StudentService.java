package com.example.demo.services;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.LoginDTO;
import com.example.demo.DTO.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.response.LoginMessage;

@Service
public interface StudentService {

	String addStudent(StudentDTO studentDTO);
	
	LoginMessage loginStudent(LoginDTO loginDTO);
}
