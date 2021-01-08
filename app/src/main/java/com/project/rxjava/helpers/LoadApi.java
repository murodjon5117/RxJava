package com.project.rxjava.helpers;
import com.project.rxjava.Test.Yangi1;
import com.project.rxjava.models.User2;
import com.project.rxjava.models.Yangi.Country;
import com.project.rxjava.models.Yangi.Foydalanuvchi;
import com.project.rxjava.models.Yangi.Response;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface LoadApi {

	@GET("user")
	Observable<List<User2>> getUsers();

	@GET("konstanta")
	Observable<List<Response>> getResponse();

	@GET("country")
	Observable<List<Country>> getCountry();

	@GET("book")
	Observable<Yangi1> getBook();

	@FormUrlEncoded
	@POST("foydalanuvchi")
	Observable<Foydalanuvchi> getFoydalanuvchi(
			@Field("first_name") String s,
			@Field("last_name") String s1,
			@Field("password") String s2,
			@Field("phone") String s3);




}
