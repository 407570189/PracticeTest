package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private EditText edName;
    private EditText edword;
    private EditText edpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first2);
    }
    public void login(View view){
        edName = findViewById(R.id.firstname);
        String username =edName.getText().toString();
        if (username.equals("")){
            Intent intent =new Intent(FirstActivity.this,SecondActivity.class);
            startActivity(intent);
        }
    }
}
