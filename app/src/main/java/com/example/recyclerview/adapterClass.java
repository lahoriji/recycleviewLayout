package com.example.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapterClass extends RecyclerView.Adapter<adapterClass.viewholder>{
    Context context;
    List<users> mylist;

    public adapterClass( Context context, List<users> mylist) {
        this.context=context;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater layoutInflater = LayoutInflater.from(context);
       View view = layoutInflater.inflate(R.layout.show_laylout,parent,false);
        adapterClass.viewholder viewHolder = new adapterClass.viewholder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        users user = mylist.get(position);
        holder.id.setText(""+user.getId());
        holder.title.setText(""+user.getTitle());
    }

    @Override
    public int getItemCount() {

       return mylist.size();
    }


    public class viewholder extends RecyclerView.ViewHolder{
        TextView id;
        TextView title;


        public viewholder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.no);
            title  = itemView.findViewById(R.id.title);

        }
    }

}
