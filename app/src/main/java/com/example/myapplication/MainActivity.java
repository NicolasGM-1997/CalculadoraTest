package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView total;
    private Button btnTotal, btnFactorial, btnFibonacci;
    private Calculadora calc = new Calculadora();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total = findViewById(R.id.total);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnTotal = findViewById(R.id.btnTotal);
        btnFactorial = findViewById(R.id.btnFactorial);
        btnFibonacci = findViewById(R.id.btnFibonacci);
        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                double val1 = Double.parseDouble(num1.getText().toString());
                double val2 = Double.parseDouble(num2.getText().toString());
                total.setText("Suma:"+calc.sumar(val1, val2)+"\nResta: "+calc.restar(val1, val2)+"\nMultipicacion: "+
                    calc.multiplicar(val1, val2)+"\ndivision: "+calc.dividir(val1, val2));
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        btnFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
