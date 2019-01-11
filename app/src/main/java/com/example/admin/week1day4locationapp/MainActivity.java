package com.example.admin.week1day4locationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    //
    String stringHolder1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.text1);
        //
        button = findViewById(R.id.button);
    }

    public void onClick(View view) {
            stringHolder1 = textView1.getText().toString();
    }

    public void onClickBtn(View view) {
        Intent intent = new Intent(this, SecondActivity.class );
        Bundle bundle = new Bundle();
        bundle.putString("text", stringHolder1);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
