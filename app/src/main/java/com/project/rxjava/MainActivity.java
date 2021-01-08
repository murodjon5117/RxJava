package com.project.rxjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.project.rxjava.Test.ResultsItem;
import com.project.rxjava.Test.Yangi1;
import com.project.rxjava.adapter.Adapter;
import com.project.rxjava.helpers.LoadJson;
import com.project.rxjava.models.User2;
import com.project.rxjava.models.Yangi.Country;
import com.project.rxjava.models.Yangi.Foydalanuvchi;
import com.project.rxjava.models.Yangi.Response;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    CompositeDisposable compositeDisposable = new CompositeDisposable();
    Adapter adapter;
    RecyclerView recyclerView;
    List<User2> list;
    List<ResultsItem> list1;
    List<Country> list2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidNetworking.initialize(getApplicationContext());
        recyclerView=findViewById(R.id.recycler);
        list=new ArrayList<>();
        list1=new ArrayList<>();
        list2=new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL,false));
        adapter=new Adapter(MainActivity.this,list2);

    }
    public void btnLoad(View view) {
        compositeDisposable.add(LoadJson.getApi(this).getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<List<User2>>() {
                    @Override
                    public void onNext(@NonNull List<User2> users) {
                        list.addAll(users);
                        recyclerView.setAdapter(adapter);
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        System.out.println(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                })
        );
    }

    public void btnLoad1(View view) {
        compositeDisposable.add(LoadJson.getApi1(this).getBook()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<Yangi1>() {
                    @Override
                    public void onNext(@NonNull Yangi1 users) {

                        list1.addAll(users.getResults());

                        for (int i=0;i<list1.size();i++){
                            System.out.println(list1.get(i).getId());
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        System.out.println(e.getMessage());
                        Toast.makeText(MainActivity.this, "Kechirasz", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                })
        );
    }

    public void btnLoad2(View view) {
        compositeDisposable.add(LoadJson.getApi3(this).getFoydalanuvchi("ssd","sdsadEjon","gEjson","989578932542")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<Foydalanuvchi>() {
                    @Override
                    public void onNext(@NonNull Foydalanuvchi users) {

                        System.out.println(users.toString());

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                        System.out.println(e.getMessage());

                    }

                    @Override
                    public void onComplete() {

                    }
                })
        );
    }
}