package com.example.myapplication;

public class Calculadora {
    public double sumar(double num1, double num2){
        return num1 + num2;
    }

    public double restar(double num1, double num2){
        return num1 - num2;
    }

    public double dividir(double num1, double num2){
        return num1 / num2;
    }

    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public int fibonacci(int num){
        if(num > 1){
            return fibonacci(num-1) + fibonacci(num-2);
        } else {
            return 1;
        }
    }

    public int factorial(int num){
        if(num > 1){
            return num * factorial(num-1);
        } else {
            return 1;
        }
    }
}
