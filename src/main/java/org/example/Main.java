package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("6 / 2 = " + division(6, 2));
    }

    public static int division(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}