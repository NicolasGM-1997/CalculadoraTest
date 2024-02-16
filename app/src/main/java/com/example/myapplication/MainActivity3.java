package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText num4;
    private Button btnTotal3;
    private TextView total3;
    private Calculadora calc = new Calculadora();
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        num4 = findViewById(R.id.num4);
        btnTotal3 = findViewById(R.id.btnTotal3);
        btnTotal3.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                int val1 = Integer.parseInt(num4.getText().toString());
                total3.setText("Total:"+calc.fibonacci(val1));
            }
        });
    }
}