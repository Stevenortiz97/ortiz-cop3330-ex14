/*
// *  UCF COP3330 Summer 2021 Assignment 14
// *  Copyright 2021 Steven Ortiz
// */

//What is the order amount? 10
//What is the state? WI
//The subtotal is $10.00.
//The tax is $0.55.
//The total is $10.55.

package org.example;

import java.text.DecimalFormat;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    private static double cost() {

        System.out.print("What is the order amount? ");
        return in.nextInt();
    }

    public static void main(String[] args) {


        double cost = cost();
        double taxRate = 0.055;

        System.out.print("What is the state? ");
        String state = in.next();

        if (state.equals("WI")) {

            double totalTax = cost * taxRate;
            cost = totalTax + cost;
            double subtotal = cost - totalTax;
            System.out.println("The tax is $" +totalTax+ ".");
            System.out.println("The subtotal is $"+String.format("%.2f",subtotal)+".");
        }

        double totalCostr = cost * 100.0;
        double costr = (double) Math.ceil(totalCostr);
        double costF = costr/ 100.0;



        System.out.print("The total is $" +String.format("%.2f",costF)+".");

    }
}