package com.lnragi.java.rest.jaxrs.exceptions;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer userId;

	public UserNotFoundException() {
	}

	public UserNotFoundException(Integer uid) {
		super("User #" + uid + " was not found");
		this.userId = uid;
	}


	public Integer getUserId() {
		return userId;
	}
	
}
