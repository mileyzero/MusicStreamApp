package com.example.musicstreamapp;

public class TestRelational
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        String name = "Jerome";
        String compareName = "Jerome";

        System.out.println("Name compared " + !(name.equals(compareName)));
        System.out.println("a == b " + (a==b));
        System.out.println("a != b " + (a!=b));
        System.out.println("a > b " + (a>b));
        System.out.println("a < b " + (a<b));
        System.out.println("a <= b " + (a<=b));
        System.out.println("a >= b " + (a>=b));
    }
}
