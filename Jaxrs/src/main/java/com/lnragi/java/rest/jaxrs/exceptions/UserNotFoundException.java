package com.lnragi.java.rest.jaxrs.exceptions;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errMsg;

	public UserNotFoundException() {
	}

	public UserNotFoundException(String errMsg) {
		super();
		this.errMsg = errMsg;
	}

}
