package com.example.laptop.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView =(ListView) findViewById(R.id.listViewid);
        final String [] country_names = getResources().getStringArray(R.array.countryNames);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sampleview, R.id.textViewId,country_names);
        ListView.setAdapter(adapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = country_names[i];
                Toast.makeText(MainActivity.this,value+""+i,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
