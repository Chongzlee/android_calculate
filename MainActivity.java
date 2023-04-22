package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = findViewById(R.id.addition);
        Button sub = findViewById(R.id.subtraction); // corrected id
        Button multiple = findViewById(R.id.multiplication); // corrected id
        Button divide = findViewById(R.id.division); // corrected id
        String[] sym= {"+","-","x","/"};


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, processview.class);
                intent.putExtra("sm",sym[0]);
                startActivity(intent);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, processview.class);
                intent.putExtra("sm",sym[1]);
                startActivity(intent);
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, processview.class);
                intent.putExtra("sm",sym[2]);
                startActivity(intent);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() { // corrected variable name
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, processview.class);
                intent.putExtra("sm",sym[3]);
                startActivity(intent);
            }
        });

    }
}
