package com.example.vignesh.displaymessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button button;
    String displaymessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.edit_text1);
        button = findViewById(R.id.button);
    }

    public void click(View view) {
        displaymessage = text.getText().toString();
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message", displaymessage);
        startActivity(intent);
    }
}
