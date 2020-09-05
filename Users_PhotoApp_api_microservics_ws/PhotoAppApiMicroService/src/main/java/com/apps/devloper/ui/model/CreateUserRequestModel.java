package com.apps.devloper.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {

	@NotNull(message = "first name should be empty")
	@Size(min = 2, message = "first name must be minimmum 2 characters")
	private String firstName;

	@NotNull(message = "last name should not be empty")
	@Size(min = 2, message = "last name must be minimmum 2 characters")
	private String lastName;

	@NotNull(message = "password name should not be empty")
	@Size(min = 2, message = "first name must be minimmum 2 characters")
	private String password;

	@NotNull(message = "email should not be empty")
	@Email
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
