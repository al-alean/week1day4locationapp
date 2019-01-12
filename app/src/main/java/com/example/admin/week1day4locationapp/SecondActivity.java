package com.example.admin.week1day4locationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intend = getIntent();
        Bundle bundle = intend.getExtras();
        String string = bundle.getString("text");
        textView=findViewById(R.id.display);

        if(string != null && !string.isEmpty() ){
            textView.setText(string);
        }
    }
}
