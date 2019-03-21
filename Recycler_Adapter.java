package com.example.faizanmalik.sjbxsj.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.faizanmalik.sjbxsj.Main2Activity;
import com.example.faizanmalik.sjbxsj.Main3Activity;
import com.example.faizanmalik.sjbxsj.Main4Activity;
import com.example.faizanmalik.sjbxsj.Model.Model_recycler;
import com.example.faizanmalik.sjbxsj.R;

import java.util.List;


public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.Holder> {

    Context context;
    List<Model_recycler> list;

    Class aClass[]={Main2Activity.class,Main4Activity.class,null,Main3Activity.class};

    public Recycler_Adapter(Context applicationContext, List<Model_recycler> list) {
        this.context=applicationContext;
        this.list=list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.custom_recycler_view,viewGroup,false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int i) {

        Model_recycler model_recycler=list.get(i);

        int img=model_recycler.getImg();
        String name=model_recycler.getName();
        String dec=model_recycler.getDesc();

        holder.imageView.setImageResource(img);
        holder.t1.setText(name);
        holder.t2.setText(dec);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context=v.getContext();
                try {
                    context.startActivity(new Intent(context,aClass[i]));

                }catch (Exception e){

                }

                }


        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView t1,t2;
        LinearLayout linearLayout;
        public Holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imgUser);
            t1=itemView.findViewById(R.id.nameUser);
            t2=itemView.findViewById(R.id.Desc);
            linearLayout=itemView.findViewById(R.id.linearLayout);


        }
    }
}
