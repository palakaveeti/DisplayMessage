package com.example.vignesh.displaymessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    String messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView =findViewById(R.id.textmessage);
        Intent intent = getIntent();
        messages = intent.getStringExtra("message");
        textView.setText(messages);
    }
}
