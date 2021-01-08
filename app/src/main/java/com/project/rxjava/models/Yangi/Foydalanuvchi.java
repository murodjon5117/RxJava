package com.project.rxjava.models.Yangi;

import com.google.gson.annotations.SerializedName;

public class Foydalanuvchi{

	@SerializedName("image")
	private Object image;

	@SerializedName("country")
	private Object country;

	@SerializedName("bonus")
	private int bonus;

	@SerializedName("last_sean")
	private Object lastSean;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("password")
	private String password;

	@SerializedName("phone")
	private String phone;

	@SerializedName("regdate")
	private String regdate;

	@SerializedName("id")
	private int id;

	@SerializedName("job")
	private Object job;

	@SerializedName("region")
	private Object region;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("cash")
	private int cash;

	@SerializedName("email")
	private Object email;

	@SerializedName("age")
	private Object age;

	@SerializedName("status")
	private int status;

	public void setImage(Object image){
		this.image = image;
	}

	public Object getImage(){
		return image;
	}

	public void setCountry(Object country){
		this.country = country;
	}

	public Object getCountry(){
		return country;
	}

	public void setBonus(int bonus){
		this.bonus = bonus;
	}

	public int getBonus(){
		return bonus;
	}

	public void setLastSean(Object lastSean){
		this.lastSean = lastSean;
	}

	public Object getLastSean(){
		return lastSean;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setRegdate(String regdate){
		this.regdate = regdate;
	}

	public String getRegdate(){
		return regdate;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setJob(Object job){
		this.job = job;
	}

	public Object getJob(){
		return job;
	}

	public void setRegion(Object region){
		this.region = region;
	}

	public Object getRegion(){
		return region;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setCash(int cash){
		this.cash = cash;
	}

	public int getCash(){
		return cash;
	}

	public void setEmail(Object email){
		this.email = email;
	}

	public Object getEmail(){
		return email;
	}

	public void setAge(Object age){
		this.age = age;
	}

	public Object getAge(){
		return age;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Foydalanuvchi{" + 
			"image = '" + image + '\'' + 
			",country = '" + country + '\'' + 
			",bonus = '" + bonus + '\'' + 
			",last_sean = '" + lastSean + '\'' + 
			",last_name = '" + lastName + '\'' + 
			",password = '" + password + '\'' + 
			",phone = '" + phone + '\'' + 
			",regdate = '" + regdate + '\'' + 
			",id = '" + id + '\'' + 
			",job = '" + job + '\'' + 
			",region = '" + region + '\'' + 
			",first_name = '" + firstName + '\'' + 
			",cash = '" + cash + '\'' + 
			",email = '" + email + '\'' + 
			",age = '" + age + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}