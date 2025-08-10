package com.ismat;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Enter currency in rupees : ");
        Scanner input=new Scanner(System.in);
        float INR=input.nextFloat();
        float USD=INR/81;
        System.out.println("The given currency ₹ "+ INR+ "is $" + USD+ " in USD");
    }
}
