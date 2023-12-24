package com.example.greeting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText myInputValue = findViewById(R.id.name);
        Button submitBtn = findViewById(R.id.submitBtn);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputValue =  myInputValue.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome "+inputValue, Toast.LENGTH_LONG).show();
            }
        });


    }
}