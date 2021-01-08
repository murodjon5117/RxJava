package com.project.rxjava.models.Yangi;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("file")
	private String file;

	@SerializedName("mijoz")
	private Mijoz mijoz;

	@SerializedName("vaqt")
	private String vaqt;

	@SerializedName("id")
	private int id;

	@SerializedName("tolov")
	private String tolov;

	@SerializedName("hisobchi")
	private Hisobchi hisobchi;

	public void setFile(String file){
		this.file = file;
	}

	public String getFile(){
		return file;
	}

	public void setMijoz(Mijoz mijoz){
		this.mijoz = mijoz;
	}

	public Mijoz getMijoz(){
		return mijoz;
	}

	public void setVaqt(String vaqt){
		this.vaqt = vaqt;
	}

	public String getVaqt(){
		return vaqt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTolov(String tolov){
		this.tolov = tolov;
	}

	public String getTolov(){
		return tolov;
	}

	public void setHisobchi(Hisobchi hisobchi){
		this.hisobchi = hisobchi;
	}

	public Hisobchi getHisobchi(){
		return hisobchi;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"file = '" + file + '\'' + 
			",mijoz = '" + mijoz + '\'' + 
			",vaqt = '" + vaqt + '\'' + 
			",id = '" + id + '\'' + 
			",tolov = '" + tolov + '\'' + 
			",hisobchi = '" + hisobchi + '\'' + 
			"}";
		}
}