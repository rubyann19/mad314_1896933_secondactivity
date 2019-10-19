package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText name,id,password;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.NAME);
        id=findViewById(R.id.id);
        password=findViewById(R.id.password);
        button =findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().equals("admin")&&password.getText().equals("student")){

                    Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"FAILED",Toast.LENGTH_LONG);
                }
            }
        });


    }
}
