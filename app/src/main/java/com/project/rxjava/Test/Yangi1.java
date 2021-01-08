package com.project.rxjava.Test;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Yangi1{

	@SerializedName("next")
	private String next;

	@SerializedName("previous")
	private String previous;

	@SerializedName("count")
	private int count;

	@SerializedName("results")
	private List<ResultsItem> results;

	public String getNext(){
		return next;
	}

	public String getPrevious(){
		return previous;
	}

	public int getCount(){
		return count;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}