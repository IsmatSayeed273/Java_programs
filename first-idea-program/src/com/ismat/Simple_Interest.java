package com.ismat;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of p,r and t");
        int p=input.nextInt();
        float r=input.nextFloat();
        int t=input.nextInt();
        float Simple_Interest=(p*r*t)/100;
        System.out.println("The calculated simple interest is :"+Simple_Interest);

    }
}
