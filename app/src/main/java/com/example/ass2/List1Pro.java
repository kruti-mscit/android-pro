package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class List1Pro extends AppCompatActivity {

    private EditText txtItem;
    private Button addBtn;
    private Button removeBtn;
    private ListView list;
        private ArrayAdapter<String> adapter;
        private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1_pro);


        txtItem = (EditText) findViewById(R.id.txt1);
        addBtn = (Button) findViewById(R.id.btnA);
        removeBtn = (Button) findViewById(R.id.btnnR);
        list = (ListView) findViewById(R.id.l1);
        arrayList = new ArrayList<String>();

        // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
        // and the array that contains the data
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);

        // Here, you set the data in your ListView
        list.setAdapter(adapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtItem.getText().toString().isEmpty()) {
                    arrayList.add(txtItem.getText().toString());
                    adapter = new ArrayAdapter(List1Pro.this, android.R.layout.simple_list_item_1, arrayList);
                    list.setAdapter(adapter);
                    Toast.makeText(List1Pro.this, "Inserted", Toast.LENGTH_LONG).show();
                } else {
                    txtItem.setError("Enter Item");
                }
            }
        });

        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arrayList.size()>0) {
                    if (!txtItem.getText().toString().isEmpty()) {
                        arrayList.remove(txtItem.getText().toString());
                        adapter = new ArrayAdapter(List1Pro.this, android.R.layout.simple_list_item_1, arrayList);
                        list.setAdapter(adapter);
                        Toast.makeText(List1Pro.this, "deleted", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(List1Pro.this, "There is no element to delete", Toast.LENGTH_LONG).show();
                }
            }
        });


    }


}