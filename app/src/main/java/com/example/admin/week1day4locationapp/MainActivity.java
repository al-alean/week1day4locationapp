package com.example.admin.week1day4locationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    //
    String stringHolder;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);
        textView4 = findViewById(R.id.text4);
        textView5 = findViewById(R.id.text5);

        button = findViewById(R.id.button);
    }

    public void onClick1(View view) {
            stringHolder = textView1.getText().toString();
    }
    public void onClick2(View view) { stringHolder = textView2.getText().toString(); }
    public void onClick3(View view) { stringHolder = textView3.getText().toString(); }
    public void onClick4(View view) { stringHolder = textView4.getText().toString(); }
    public void onClick5(View view) { stringHolder = textView5.getText().toString(); }

    public void onClickBtn(View view) {
        Intent intent = new Intent(this, SecondActivity.class );
        Bundle bundle = new Bundle();
        bundle.putString("text", stringHolder);
        intent.putExtras(bundle);
        startActivity(intent);

    }

}
