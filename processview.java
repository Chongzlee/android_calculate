package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class processview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processview);

        Button back = findViewById(R.id.back);
        Button an = findViewById(R.id.compute);
        EditText firstnum = findViewById(R.id.firstnumber);
        EditText secoundnum = findViewById(R.id.secondnumber);
        TextView symbol = findViewById(R.id.synbol);
        TextView answer = findViewById(R.id.result);
        Intent intent = getIntent();
        String sm = intent.getStringExtra("sm");


        switch(sm){
            case "+" : {
                symbol.setText(sm);
                an.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        float fn = Float.parseFloat(firstnum.getText().toString());
                        float sn = Float.parseFloat(secoundnum.getText().toString());
                        float ans = fn +sn;
                        answer.setText(Float.toString(ans));
                    }
                });
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                break;
            }
            case "-" : {
                symbol.setText(sm);
                an.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        float fn = Float.parseFloat(firstnum.getText().toString());
                        float sn = Float.parseFloat(secoundnum.getText().toString());
                        float ans = fn -sn;
                        answer.setText(Float.toString(ans));
                    }
                });
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                break;
            }
            case "x" : {
                symbol.setText(sm);
                an.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        float fn = Float.parseFloat(firstnum.getText().toString());
                        float sn = Float.parseFloat(secoundnum.getText().toString());
                        float ans = fn *sn;
                        answer.setText(Float.toString(ans));
                    }
                });
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                break;
            }
            case "/" : {
                symbol.setText(sm);
                an.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        float fn = Float.parseFloat(firstnum.getText().toString());
                        float sn = Float.parseFloat(secoundnum.getText().toString());
                        float ans = fn /sn;
                        answer.setText(Float.toString(ans));
                    }
                });
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                break;
            }
        }


    }
}