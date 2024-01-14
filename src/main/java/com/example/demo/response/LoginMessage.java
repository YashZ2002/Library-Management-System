package com.example.demo.response;

public class LoginMessage {

	String Message;
	Boolean status;

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}



	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public LoginMessage(String message, Boolean status) {
		super();
		Message = message;
		this.status = status;
	}

	public LoginMessage() {
		super();
	}

}
