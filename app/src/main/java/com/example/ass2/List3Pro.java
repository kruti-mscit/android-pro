package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List3Pro extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> adapter1;
    private List<String> liste;
    private List<String> cList;
    ListView lv;
    ListView lvC;
    TextView tv;
    TextView tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3_pro);

        lv=findViewById(R.id.listD);
        lvC=findViewById(R.id.listC);
        tv=findViewById(R.id.txtDesc);
        tt=findViewById(R.id.tTopic);

        String[] depts = new String[] { "Commerce","Engineering","IT" };

        String[] cmCourses = new String[] { "B.com","M.com" };
        String[] enCourses = new String[] { "B.E.","M.E." };
        String[] itCourses = new String[] { "Msc.IT","Msc.ICT" };

        liste = new ArrayList<String>();
        Collections.addAll(liste, depts);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, liste);
        cList = new ArrayList<String>();
        adapter1 = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, cList);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String info = ( (TextView) view ).getText().toString();

                switch(info){
                    case "Commerce":

                        adapter1.clear();
                        Collections.addAll(cList, cmCourses);
                        lvC.setAdapter(adapter1);

                        break;
                    case "Engineering":

                        adapter1.clear();
                        Collections.addAll(cList, enCourses);
                        lvC.setAdapter(adapter1);
                        break;
                    case "IT":
                        adapter1.clear();
                        Collections.addAll(cList, itCourses);
                        lvC.setAdapter(adapter1);
                        break;
                    default:
                        break;
                }
            }
        });


        lvC.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String info1 = ( (TextView) view ).getText().toString();

                        tt.setText(" Course : " +info1);
                        tv.setText("This is "+info1+" Course.");

            }
        });

    }
}