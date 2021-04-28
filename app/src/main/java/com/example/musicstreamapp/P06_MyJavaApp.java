package com.example.musicstreamapp;

import static java.lang.System.out;

public class P06_MyJavaApp
{
    public static void main(String[] args)
    {
        //name variable
        String name = "Jerome";

        //labelling price1 to string
        String price1 = "12.90";
        //labelling price2 to double
        double price2 = 12.90;

        //labelling age to int
        int age = 13;
        //labelling years to int
        int years = 5;

        double lengthOfTable = 1.6;
        String nameOfFlower = "Angelica";
        double priceOfPhone = 1199.99;
        int ageOfStudent = 17;
        boolean rainStopped = true;
        char grade = 'B';




       System.out.println("Hello World");
       System.out.println("My name is " + " " + name);
       System.out.println(price1 + price2);
       System.out.println(age + years);

       System.out.println("The length of this table is " + lengthOfTable + "m");
       System.out.println("The name of this flower is " + nameOfFlower);
       System.out.println("The price of this phone is " + "$" + priceOfPhone);
       System.out.println("The age of this student is " + ageOfStudent);
       System.out.println("the grade is " + grade);
       System.out.println("It is " + rainStopped + " that the rain has stopped.");
    }
}
