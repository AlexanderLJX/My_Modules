package com.id20048076.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
    }
    public void onClick5(View view){
        Intent intent = new Intent( MainActivity.this, ModuleActivity.class);
        intent.putExtra("code", "C346");
        intent.putExtra("name", "Mobile App Development");
        intent.putExtra("year", "2021");
        intent.putExtra("semester", "1");
        intent.putExtra("credit", "4");
        intent.putExtra("venue", "E62E");
        startActivity(intent);
    }
    public void onClick1(View view){
        Intent intent = new Intent( MainActivity.this, ModuleActivity.class);
        intent.putExtra("code", "C203");
        intent.putExtra("name", "Web Appln Development in php");
        intent.putExtra("year", "2021");
        intent.putExtra("semester", "1");
        intent.putExtra("credit", "4");
        intent.putExtra("venue", "W67L");
        startActivity(intent);
    }
    public void onClick2(View view){
        Intent intent = new Intent( MainActivity.this, ModuleActivity.class);
        intent.putExtra("code", "C228");
        intent.putExtra("name", "Operating Systems Security");
        intent.putExtra("year", "2021");
        intent.putExtra("semester", "1");
        intent.putExtra("credit", "4");
        intent.putExtra("venue", "E62L");
        startActivity(intent);
    }
    public void onClick3(View view){
        Intent intent = new Intent( MainActivity.this, ModuleActivity.class);
        intent.putExtra("code", "C328");
        intent.putExtra("name", "Intelligent Networks");
        intent.putExtra("year", "2021");
        intent.putExtra("semester", "1");
        intent.putExtra("credit", "4");
        intent.putExtra("venue", "E62C");
        startActivity(intent);
    }
    public void onClick4(View view){
        Intent intent = new Intent( MainActivity.this, ModuleActivity.class);
        intent.putExtra("code", "C331");
        intent.putExtra("name", "Digital Security and Forensics");
        intent.putExtra("year", "2021");
        intent.putExtra("semester", "1");
        intent.putExtra("credit", "4");
        intent.putExtra("venue", "E61J");
        startActivity(intent);
    }
}