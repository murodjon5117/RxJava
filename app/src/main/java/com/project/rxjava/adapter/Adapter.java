package com.project.rxjava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.rxjava.R;
import com.project.rxjava.models.Yangi.Country;
import com.project.rxjava.models.Yangi.Response;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private Context context;
    private List<Country> headlineModelList;

    public Adapter(Context context, List<Country> headlineModelList) {
        this.context = context;
        this.headlineModelList = headlineModelList;
    }
    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new Adapter.MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final Adapter.MyViewHolder holder, final int position) {
        final Country headlineModel=headlineModelList.get(position);
        holder.v_title.setText(String.valueOf(headlineModel.getId()));

        holder.name.setText(headlineModel.getName());


    }

    @Override
    public int getItemCount() {
        return headlineModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView v_title;
        TextView name;
        View vv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            v_title = itemView.findViewById(R.id.textView);
            name=itemView.findViewById(R.id.textView1);
            vv = itemView;
        }
    }
}
