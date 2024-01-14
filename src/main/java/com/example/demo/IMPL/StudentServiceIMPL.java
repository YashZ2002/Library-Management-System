package com.example.demo.IMPL;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.LoginDTO;
import com.example.demo.DTO.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.response.LoginMessage;
import com.example.demo.services.StudentService;
@Service
public class StudentServiceIMPL implements StudentService{

	@Autowired 
	private StudentRepo studentRepo;
	
	@Override
	public String addStudent(StudentDTO studentDTO) {
		Student student=new Student(
		studentDTO.getStudentid(),
		studentDTO.getStudentfirstname(),
		studentDTO.getStudentlastname(),
		studentDTO.getStudentemail(),
		studentDTO.getPassword());
		studentRepo.save(student);
		return student.getStudentfirstname();
	}

	@Override
	public LoginMessage loginStudent(LoginDTO loginDTO) {
        String msg = "";
    
		Student student1 = studentRepo.findByStudentemail(loginDTO.getEmail());
	        if (student1 != null) {
	            String password = loginDTO.getPassword();
	            String encodedPassword = student1.getPassword();
	            Boolean isPwdRight = password.matches(encodedPassword);
	            if (isPwdRight) {
	                Optional<Student> student = studentRepo.findOneByStudentemailAndPassword(loginDTO.getEmail(), encodedPassword);
	                if (student.isPresent()) {
	                    return new LoginMessage("Login Success", true);
	                } else {
	                    return new LoginMessage("Login Failed", false);
	                }
	            } else {
	                return new LoginMessage("password Not Match", false);
	            }
	        }else {
	            return new LoginMessage("Email not exits", false);
	        }
	    
	}
	
	
}
