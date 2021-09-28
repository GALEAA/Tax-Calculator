package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double total, taxAmount = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter amount");
        total=input.nextDouble();
        double totalTax = total * taxAmount;
        System.out.println(totalTax);

    }
}
