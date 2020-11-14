package com.example.linearpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button relative;
   Button constraint;
   Button grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relative=findViewById(R.id.relative);
        constraint=findViewById(R.id.constrain);
        grid=findViewById(R.id.grid);
        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            String msg = extras.getString("keyMsg");
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
        }


        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Relative.class);

                startActivity(intent);

            }
        });
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Const.class);
                startActivity(intent);
            }
        });

    }
}