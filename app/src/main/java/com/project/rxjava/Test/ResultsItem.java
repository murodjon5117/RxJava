package com.project.rxjava.Test;

import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("chapter")
	private int chapter;

	@SerializedName("author")
	private String author;

	@SerializedName("reader")
	private int reader;

	@SerializedName("book")
	private String book;

	@SerializedName("description")
	private String description;

	@SerializedName("title")
	private String title;

	@SerializedName("pages")
	private int pages;

	@SerializedName("price")
	private int price;

	@SerializedName("is_free")
	private boolean isFree;

	@SerializedName("genre")
	private Genre genre;

	@SerializedName("rank")
	private double rank;

	@SerializedName("id")
	private int id;

	public String getImage(){
		return image;
	}

	public int getChapter(){
		return chapter;
	}

	public String getAuthor(){
		return author;
	}

	public int getReader(){
		return reader;
	}

	public String getBook(){
		return book;
	}

	public String getDescription(){
		return description;
	}

	public String getTitle(){
		return title;
	}

	public int getPages(){
		return pages;
	}

	public int getPrice(){
		return price;
	}

	public boolean isIsFree(){
		return isFree;
	}

	public Genre getGenre(){
		return genre;
	}

	public double getRank(){
		return rank;
	}

	public int getId(){
		return id;
	}
}