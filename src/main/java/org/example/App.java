/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static double ceilMoney(double raw){
        return Math.ceil(raw*100)/100.0;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal? ");
        double P = input.nextDouble();
        System.out.print("What is the rate as a percentage? ");
        double r = input.nextDouble()/100.0;
        System.out.print("What is the number of years? ");
        double t = input.nextDouble();
        System.out.print("What is the number of times the interest is compounded per year? ");
        double n = input.nextDouble();

        double A = ceilMoney(P*Math.pow((1+r/n), (n*t)));

        System.out.printf("$%.2f", P);
        System.out.print(" invested at " + r * 100 + "% for " + t + " years compounded " +
                n + " times per year is ");
        System.out.printf("$%.2f.", A);



    }
}
