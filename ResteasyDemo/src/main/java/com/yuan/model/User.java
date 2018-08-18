package com.yuan.model;

public class User {
	private int id;
	private String firstName;
	private String lastName;

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastname) {
		this.lastName = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + "::" + firstName + "::" + lastName;
	}

}
