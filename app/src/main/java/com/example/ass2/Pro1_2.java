package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Pro1_2 extends AppCompatActivity {


    TextView tnm;
    TextView tage;
    TextView tadd;
    TextView tct;
    TextView tpn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro12);

        tnm=findViewById(R.id.tName);
        tage=findViewById(R.id.tAge);
        tadd=findViewById(R.id.tAdd);
        tct=findViewById(R.id.tCity);
        tpn=findViewById(R.id.tPhone);

        Intent intent = getIntent();
        String str = intent.getStringExtra("snm");
        String str1 = intent.getStringExtra("sage");
        String str2 = intent.getStringExtra("sadd");
        String str3 = intent.getStringExtra("scity");
        String str4 = intent.getStringExtra("sphone");


        tnm.setText("Name : "+str);
        tage.setText("Age : "+str1);
        tadd.setText("Address : "+str2);
        tct.setText("City : "+str3);
        tpn.setText("Phone : "+str4);


    }
}