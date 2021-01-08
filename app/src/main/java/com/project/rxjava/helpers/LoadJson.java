package com.project.rxjava.helpers;

import android.content.Context;

import com.readystatesoftware.chuck.ChuckInterceptor;

import java.util.concurrent.TimeUnit;

import io.reactivex.schedulers.Schedulers;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoadJson {
	private static Retrofit retrofit;
	private static LoadApi api;

	public static LoadApi getApi(Context mCtx){
						if (api != null){
							return api;
						}
						RxJava2CallAdapterFactory rxAdapter =
								RxJava2CallAdapterFactory
										.createWithScheduler(Schedulers.io());
						OkHttpClient okHttpClient = new OkHttpClient()
								.newBuilder()
//				.authenticator((route, response) -> {
//					String auth = Credentials.basic("","");
//					return response.request().newBuilder()
//							.header("Authorization", auth)
//							.build();
//				})
								.addInterceptor(chain -> {
									Request original = chain.request();
									Request request = original.newBuilder()
//							.header("X-MobileLang",lang)
//							.header("token", shared.getToken())
							.method(original.method(), original.body())
							.build();

					return chain.proceed(request);
				})
				.addInterceptor(new ChuckInterceptor(mCtx))
				.connectTimeout(60, TimeUnit.SECONDS)
				.readTimeout(60, TimeUnit.SECONDS)
				.writeTimeout(60, TimeUnit.SECONDS)
				.build();

		retrofit = new Retrofit.Builder()
				.baseUrl("http://finance.algorithmgateway.uz/api/")
				.addConverterFactory(GsonConverterFactory.create())
				.addCallAdapterFactory(rxAdapter)
				.client(okHttpClient)
				.build();
		api = retrofit.create(LoadApi.class);
		return api;
	}

	public static LoadApi getApi1(Context mCtx){
							if (api != null){
								return api;
							}
							RxJava2CallAdapterFactory rxAdapter =
									RxJava2CallAdapterFactory
											.createWithScheduler(Schedulers.io());
							OkHttpClient okHttpClient = new OkHttpClient()
									.newBuilder()
	//				.authenticator((route, response) -> {
	//					String auth = Credentials.basic("","");
	//					return response.request().newBuilder()
	//							.header("Authorization", auth)
	//							.build();
	//				})
									.addInterceptor(chain -> {
										Request original = chain.request();
										Request request = original.newBuilder()
	//							.header("X-MobileLang",lang)
								.header("Authorization", "token 815e581ce959cc517dbcba6311d1fe5c02542c66")
								.method(original.method(), original.body())
								.build();

						return chain.proceed(request);
					})
					.addInterceptor(new ChuckInterceptor(mCtx))
					.connectTimeout(60, TimeUnit.SECONDS)
					.readTimeout(60, TimeUnit.SECONDS)
					.writeTimeout(60, TimeUnit.SECONDS)
					.build();

			retrofit = new Retrofit.Builder()
					.baseUrl("http://188.166.227.70/api-mobil/")
					.addConverterFactory(GsonConverterFactory.create())
					.addCallAdapterFactory(rxAdapter)
					.client(okHttpClient)
					.build();
			api = retrofit.create(LoadApi.class);
			return api;
		}
		public static LoadApi getApi2(Context mCtx){
							if (api != null){
								return api;
							}
							RxJava2CallAdapterFactory rxAdapter =
									RxJava2CallAdapterFactory
											.createWithScheduler(Schedulers.io());
							OkHttpClient okHttpClient = new OkHttpClient()
									.newBuilder()
									.authenticator((route, response) -> {
									String auth = Credentials.basic("mj","0");
					return response.request().newBuilder()
							.header("Authorization", auth)
							.build();
				})
									.addInterceptor(chain -> {
										Request original = chain.request();
										Request request = original.newBuilder()
	//							.header("X-MobileLang",lang)
	//							.header("token", shared.getToken())
								.method(original.method(), original.body())
								.build();

						return chain.proceed(request);
					})
					.addInterceptor(new ChuckInterceptor(mCtx))
					.connectTimeout(60, TimeUnit.SECONDS)
					.readTimeout(60, TimeUnit.SECONDS)
					.writeTimeout(60, TimeUnit.SECONDS)
					.build();

			retrofit = new Retrofit.Builder()
					.baseUrl("http://speaker.eduon.uz/api/")
					.addConverterFactory(GsonConverterFactory.create())
					.addCallAdapterFactory(rxAdapter)
					.client(okHttpClient)
					.build();
			api = retrofit.create(LoadApi.class);
			return api;
		}
		public static LoadApi getApi3(Context mCtx){
									if (api != null){
										return api;
									}
									RxJava2CallAdapterFactory rxAdapter =
											RxJava2CallAdapterFactory
													.createWithScheduler(Schedulers.io());
									OkHttpClient okHttpClient = new OkHttpClient()
											.newBuilder()
											.authenticator((route, response) -> {
											String auth = Credentials.basic("mj","0");
							return response.request().newBuilder()
									.header("Authorization", auth)
									.build();
						})
											.addInterceptor(chain -> {
												Request original = chain.request();
												Request request = original.newBuilder()
			//							.header("X-MobileLang",lang)
			//							.header("token", shared.getToken())
										.method(original.method(), original.body())
										.build();

								return chain.proceed(request);
							})
							.addInterceptor(new ChuckInterceptor(mCtx))
							.connectTimeout(60, TimeUnit.SECONDS)
							.readTimeout(60, TimeUnit.SECONDS)
							.writeTimeout(60, TimeUnit.SECONDS)
							.build();

					retrofit = new Retrofit.Builder()
							.baseUrl("http://speaker.eduon.uz/api/")
							.addConverterFactory(GsonConverterFactory.create())
							.addCallAdapterFactory(rxAdapter)
							.client(okHttpClient)
							.build();
					api = retrofit.create(LoadApi.class);
					return api;
				}

}
