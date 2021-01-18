package com.example.fireapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName,editTextNumberPassword;
    TextView textView2,textView3,textView4,textView5;
    private Button button;
    //FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });

        Toast.makeText(MainActivity.this,"firebase connection success", Toast.LENGTH_LONG).show();
    }

    public void openLogin(){
        Intent intent = new Intent(this,loginpage.class);
        startActivity(intent);
    }
}