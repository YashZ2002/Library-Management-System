package com.example.demo.DTO;

public class StudentDTO {

	private int studentid;

	private String studentfirstname;

	private String studentlastname;

	private String studentemail;

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

	public StudentDTO(int studentid, String studentfirstname, String studentlastname, String studentemail,
			String password) {
		super();
		this.studentid = studentid;
		this.studentfirstname = studentfirstname;
		this.studentlastname = studentlastname;
		this.studentemail = studentemail;
		this.password = password;
	}

	public StudentDTO() {
		super();
	}
	
	

}
