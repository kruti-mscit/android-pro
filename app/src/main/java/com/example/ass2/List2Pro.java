package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List2Pro extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private List<String> liste;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2_pro);

        lv=findViewById(R.id.pageList);

        String[] values = new String[] { "Home","Contact","About" };

        liste = new ArrayList<String>();
        Collections.addAll(liste, values);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, liste);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String info = ( (TextView) view ).getText().toString();
                //Toast.makeText( getBaseContext(), "Page " + info, Toast.LENGTH_LONG ).show();

                Intent i1=null;

                switch(info){
                    case "Home":
                        i1=new Intent(getApplicationContext(),HomePage.class);

                        break;
                    case "Contact":
                        i1=new Intent(getApplicationContext(),ContactPage.class);
                        break;
                    case "About":
                        i1=new Intent(getApplicationContext(),AboutPage.class);
                        break;
                    default:
                        break;
                }


                startActivity(i1);


            }
        });



    }


}