package com.example.admin.week1day4locationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intend2 = getIntent();
        Bundle bundle2 = intend2.getExtras();
        String string2 = bundle2.getString("text");
        textView2=findViewById(R.id.display);

        if(string2 != null && !string2.isEmpty() ){
            textView2.setText(string2);
        }
    }
}
