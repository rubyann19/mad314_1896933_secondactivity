package com.example.myapplication;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView name,id;
    EditText password;



    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        name=itemView.findViewById(R.id.Name);
        id=itemView.findViewById(R.id.id);
        password=itemView.findViewById(R.id.password);
    }
}
