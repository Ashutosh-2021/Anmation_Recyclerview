package com.example.anmationrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrayList;

    private int LastPosition = -1;

    public ContactAdapter(Context context, ArrayList<ContactModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
        holder.img.setImageResource(arrayList.get(position).img);
        holder.txtName.setText(arrayList.get(position).name);
        holder.txtPho.setText(arrayList.get(position).pno);

//      call  the animation function for set the animation
        setAnimation(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtName, txtPho;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgView);
            txtName = itemView.findViewById(R.id.txtName);
            txtPho = itemView.findViewById(R.id.txtPno);
        }
    }

//    create a animation function
    private  void setAnimation(View view, int position){

        if (position>LastPosition) {
//            add the customize  animation
//            Animation animation = AnimationUtils.loadAnimation(context, R.anim.alpha);
//            add the default animation
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            view.setAnimation(animation);
            LastPosition = position;
        }
    }
}
