/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 20 - Multistate Sales Tax Calculator

package org.example;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner getAmount = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double order_amount = getAmount.nextDouble();

        Scanner getInfo = new Scanner(System.in);
        System.out.print("What state do you live in? ");
        String state = getInfo.nextLine();
        double tax_amount = 0.0;

        if( state.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
            String county = getInfo.nextLine();

            if (county.equals("Eau Claire")) {
                tax_amount = order_amount*0.055;
                System.out.println(String.format("The tax is $%.02f.", tax_amount));
            }
            else if(county.equals("Dunn")) {
                tax_amount = order_amount*0.054;
                System.out.println(String.format("The tax is $%.02f.", tax_amount));
            }

            }
        else if(state.equals("Illinois")){
            tax_amount = order_amount*0.08;
            System.out.println(String.format("The tax is $%.02f.", tax_amount));
        }

            double total_amount =tax_amount+order_amount;
            System.out.println(String.format("The total is $%.02f", total_amount));
    }
    }
