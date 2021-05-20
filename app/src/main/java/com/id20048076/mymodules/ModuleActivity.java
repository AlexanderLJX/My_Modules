package com.id20048076.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        tv1 = findViewById(R.id.textView6);
        tv2 = findViewById(R.id.textView7);
        tv3 = findViewById(R.id.textView8);
        tv4 = findViewById(R.id.textView9);
        tv5 = findViewById(R.id.textView10);
        tv6 = findViewById(R.id.textView11);

        Intent i = getIntent();
        String code = i.getStringExtra("code");
        String name = i.getStringExtra("name");
        String year = i.getStringExtra("year");
        String semester = i.getStringExtra("semester");
        String credit = i.getStringExtra("credit");
        String venue = i.getStringExtra("venue");

        tv1.setText("Module Code: "+code);
        tv2.setText("Module Name: "+name);
        tv3.setText("Academic Year: "+year);
        tv4.setText("Semester: "+semester);
        tv5.setText("Module Credit: "+credit);
        tv6.setText("Venue: "+venue);
    }
}