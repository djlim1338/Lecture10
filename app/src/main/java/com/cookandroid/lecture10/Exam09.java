package com.cookandroid.lecture10;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Exam09 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam09);
        setTitle("액티비티 테스트 예제");
        android.util.Log.i("액티비티 테스트", "onCreate()");

        Button btnDial = (Button) findViewById(R.id.btnDial);
        btnDial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:010-1234-5678");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        Button btnFinish = (Button) findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

}