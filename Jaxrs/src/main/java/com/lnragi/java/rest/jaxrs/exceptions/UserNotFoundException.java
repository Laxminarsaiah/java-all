package com.lnragi.java.rest.jaxrs.exceptions;

public class UserNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String firstName;
	private String lastName;
	private Integer phone;
	private String email;

	public UserNotFoundException(Integer id) {
		super("User with '#" + id + "' was not found");
		this.id = id;
	}

	
	
	
	public UserNotFoundException(String firstName, String lastName) {
		super("User with '" + firstName.concat(" ").concat(lastName)
				+ "'  was not found");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

}
