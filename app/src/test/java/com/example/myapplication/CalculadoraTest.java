package com.example.myapplication;

import static org.junit.Assert.*;
import org.junit.Test;
public class CalculadoraTest {
    Calculadora calculator = new Calculadora();

    @Test public void testFibonacci() {
        assertEquals(8, calculator.fibonacci(5), 0.001);
        assertEquals(89, calculator.fibonacci(10), 0.001);
    }

    @Test public void testFactorial() {
        assertEquals(720, calculator.factorial(6), 0.001);
        assertEquals(6, calculator.factorial(3), 0.001);
    }

    @Test public void testSumar(){
        assertEquals(720, calculator.sumar(520, 200), 0.001);
        assertEquals(271, calculator.sumar(47, 224), 0.001);
    }

    @Test public void testRestar(){
        assertEquals(-80, calculator.restar(20, 100), 0.001);
        assertEquals(75, calculator.restar(50, -25), 0.001);
    }

    @Test public void testMultiplicar(){
        assertEquals(128, calculator.multiplicar(4, 32), 0.001);
        assertEquals(-50, calculator.multiplicar(10, -5), 0.001);
    }

    @Test public void testDividir(){
        assertEquals(7, calculator.dividir(49, 7), 0.001);
        assertEquals(-15, calculator.dividir(150, -10), 0.001);
    }
}