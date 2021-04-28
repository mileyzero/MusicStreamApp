package com.example.musicstreamapp;

public class TestArithmetics
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("Addition Arithmetic: " + (a+b));
        System.out.println("Subtraction Arithmetic: " + (a-b));
        System.out.println("Multiplication Arithmetic: " + (a*b));
        System.out.println("Division Arithmetic: " + (b/a));
        System.out.println("Modules Arithmetic: " + (b%a));

        System.out.println("Increment = " + (a++));
        System.out.println("Decrement = " + (b--));

        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);

        System.out.println("Post Increment = " + (c++));
        System.out.println("Pre Increment = " + (++c));
    }
}
