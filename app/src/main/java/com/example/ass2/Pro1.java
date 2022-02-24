package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pro1 extends AppCompatActivity {

    EditText tnm,tage,tadd,tcity,tphone;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro1);

        btn=findViewById(R.id.studBtn);
        tnm=findViewById(R.id.fName);
        tage=findViewById(R.id.lName);
        tadd=findViewById(R.id.tAddress);
        tcity=findViewById(R.id.tCity);
        tphone=findViewById(R.id.tPhone);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Pro1_2.class);
                intent.putExtra("snm",tnm.getText().toString());
                intent.putExtra("sage",tage.getText().toString());
                intent.putExtra("sadd",tadd.getText().toString());
                intent.putExtra("scity",tcity.getText().toString());
                intent.putExtra("sphone",tphone.getText().toString());
                startActivity(intent);
            }
        });

    }
}