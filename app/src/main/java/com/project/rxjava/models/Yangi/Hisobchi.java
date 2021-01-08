package com.project.rxjava.models.Yangi;

import com.google.gson.annotations.SerializedName;

public class Hisobchi{

	@SerializedName("id")
	private int id;

	@SerializedName("user")
	private User user;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	@Override
 	public String toString(){
		return 
			"Hisobchi{" + 
			"id = '" + id + '\'' + 
			",user = '" + user + '\'' + 
			"}";
		}
}