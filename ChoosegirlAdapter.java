package com.example.jacka.gfgallery;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * Created by JackA on 12/23/2017.
 */

public class ChoosegirlAdapter extends RecyclerView.Adapter<ChoosegirlAdapter.ViewHolder>{
    private List<Girl> myGirlList;
    public Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        Button button;
        public ViewHolder(View view) {
            super(view);
            context = view.getContext();
            button = (Button)view.findViewById(R.id.button);
        }
    }
    public ChoosegirlAdapter(List<Girl> girlList) {
        myGirlList = girlList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.girl_list, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent;
                int position = holder.getAdapterPosition();
                Girl girl = myGirlList.get(position);
                Toast.makeText(v.getContext(),girl.getName(),
                        Toast.LENGTH_SHORT).show();
                intent = new Intent(context, Main2Activity.class);
                intent.putExtra("girl_name",girl.getName());
                intent.putExtra("normal",girl.getNormal_id());
                intent.putExtra("damage",girl.getDamage_id());
                context.startActivity(intent);
            }
        });
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int postion) {
        Girl girl = myGirlList.get(postion);
        holder.button.setText(girl.getName());
    }
    @Override
    public int getItemCount() {
        return myGirlList.size();
    }
}
