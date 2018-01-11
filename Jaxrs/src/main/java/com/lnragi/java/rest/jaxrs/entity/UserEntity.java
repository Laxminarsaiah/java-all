package com.lnragi.java.rest.jaxrs.entity;

/**
 * @author Laxminarsaiah Ragi
 *
 */
public class UserEntity {

	private Integer id;
	private String firstName;
	private String lastName;
	private Integer phone;
	private String email;

	
	
	public UserEntity(Integer id, String firstName, String lastName, Integer phone, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("UserEntity [id=%s, firstName=%s, lastName=%s, phone=%s, email=%s]", id, firstName,
				lastName, phone, email);
	}

}
