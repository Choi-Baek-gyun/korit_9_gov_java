package com.korit.study.ch28;

public class CalculatorMain {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        
        Calculator substract = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };

        Calculator multiply = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        System.out.println(x + " + " + y + " = " + add.calculate(x, y));
        System.out.println(x + " - " + y + " = " + substract.calculate(x, y));
        System.out.println(x + " * " + y + " = " + multiply.calculate(x, y));

    }
}
