package com.iiht.training.eloan.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {
		
	private Long id;
	
	@NotNull(message="First Name is mandate")
	@NotBlank(message="First Name is mandate")
	@Size(min=8,max=15,message="First Name must be of 8 to 15 chars in length")
	private String firstName;
	
	@NotNull(message="Last Name is mandate")
	@NotBlank(message="Last Name is mandate")
	@Size(min=8,max=15,message="Last Name must be of 8 to 15 chars in length")
	private String lastName;
	
	@NotNull(message="email is mandate")
	@NotBlank(message="email is mandate")
	@Email(message="Please provide a valid email address")
	private String email;
	
	@NotNull(message="mobile is mandate")	
	private String mobile;
	
	@NotNull(message="Role is mandate")
	@NotBlank(message="Role is mandate")
	private String role;
		
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
