package com.project.rxjava.models.Yangi;

import com.google.gson.annotations.SerializedName;

public class Mijoz{

	@SerializedName("shartnoma")
	private String shartnoma;

	@SerializedName("img")
	private String img;

	@SerializedName("passport")
	private String passport;

	@SerializedName("telefon")
	private String telefon;

	@SerializedName("id")
	private int id;

	@SerializedName("buyruq")
	private String buyruq;

	@SerializedName("user")
	private User user;

	@SerializedName("ustav")
	private String ustav;

	@SerializedName("guvohnoma")
	private String guvohnoma;

	@SerializedName("tashkilot")
	private String tashkilot;

	public void setShartnoma(String shartnoma){
		this.shartnoma = shartnoma;
	}

	public String getShartnoma(){
		return shartnoma;
	}

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setPassport(String passport){
		this.passport = passport;
	}

	public String getPassport(){
		return passport;
	}

	public void setTelefon(String telefon){
		this.telefon = telefon;
	}

	public String getTelefon(){
		return telefon;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setBuyruq(String buyruq){
		this.buyruq = buyruq;
	}

	public String getBuyruq(){
		return buyruq;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setUstav(String ustav){
		this.ustav = ustav;
	}

	public String getUstav(){
		return ustav;
	}

	public void setGuvohnoma(String guvohnoma){
		this.guvohnoma = guvohnoma;
	}

	public String getGuvohnoma(){
		return guvohnoma;
	}

	public void setTashkilot(String tashkilot){
		this.tashkilot = tashkilot;
	}

	public String getTashkilot(){
		return tashkilot;
	}

	@Override
 	public String toString(){
		return 
			"Mijoz{" + 
			"shartnoma = '" + shartnoma + '\'' + 
			",img = '" + img + '\'' + 
			",passport = '" + passport + '\'' + 
			",telefon = '" + telefon + '\'' + 
			",id = '" + id + '\'' + 
			",buyruq = '" + buyruq + '\'' + 
			",user = '" + user + '\'' + 
			",ustav = '" + ustav + '\'' + 
			",guvohnoma = '" + guvohnoma + '\'' + 
			",tashkilot = '" + tashkilot + '\'' + 
			"}";
		}
}