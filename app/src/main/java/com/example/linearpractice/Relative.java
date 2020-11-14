package com.example.linearpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Relative extends AppCompatActivity {
   EditText name;
   Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        name=findViewById(R.id.name);
        back=findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message= name.getText().toString();
                Intent intent=new Intent(v.getContext(),MainActivity.class);
                intent.putExtra("keyMsg",message);
                startActivity(intent);
            }
        });
    }
}