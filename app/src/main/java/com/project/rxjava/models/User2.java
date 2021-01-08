package com.project.rxjava.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User2 implements Serializable {
	@SerializedName("id")
	private int id;
	@SerializedName("username")
	private String username;
	@SerializedName("password")
	private String password;
	@SerializedName("first_name")
	private String firstName;
	@SerializedName("last_name")
	private String lastName;

	public User2() {
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
