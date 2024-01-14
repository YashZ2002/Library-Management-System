package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "student_id", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentid;

	@Column(name = "student_first_name", length = 225)
	private String studentfirstname;

	@Column(name = "student_last_name", length = 225)
	private String studentlastname;

	@Column(name = "student_email", length = 225)
	private String studentemail;

	@Column(name = "password", length = 225)
	private String password;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentfirstname() {
		return studentfirstname;
	}

	public void setStudentfirstname(String studentfirstname) {
		this.studentfirstname = studentfirstname;
	}

	public String getStudentlastname() {
		return studentlastname;
	}

	public void setStudentlastname(String studentlastname) {
		this.studentlastname = studentlastname;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student(int studentid, String studentfirstname, String studentlastname, String studentemail,
			String password) {
		super();
		this.studentid = studentid;
		this.studentfirstname = studentfirstname;
		this.studentlastname = studentlastname;
		this.studentemail = studentemail;
		this.password = password;
	}

	public Student() {
		super();
	}

}
