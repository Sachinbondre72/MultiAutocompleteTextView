package com.example.multiautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    MultiAutoCompleteTextView textView;
    ArrayAdapter arrayAdapter;
    String city[] = {"Pune","Patna","Ahmednagar","Ahemadabad","Mumbai","Merath","Nashik","Nagpur","Nandurbar","Delhi","Deharadun","Daman","Jaipur"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.multiautocompletetextview);
        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,city);
        textView.setAdapter(arrayAdapter);
        textView.setThreshold(1);
        textView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
