package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText num3;
    private Button btnTotal2;
    private TextView total2;
    private Calculadora calc = new Calculadora();
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        num3 = findViewById(R.id.num3);
        btnTotal2 = findViewById(R.id.btnTotal2);
        btnTotal2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                int val1 = Integer.parseInt(num3.getText().toString());
                total2.setText("Total: "+calc.factorial(val1));
            }
        });
    }
}