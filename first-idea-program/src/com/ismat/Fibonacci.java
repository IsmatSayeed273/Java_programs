package com.ismat;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int first=0,second=1;
        System.out.println("fibonacci series upto "+n+ " is: ");
        for(int i=1; i<=n; i++) {
            System.out.println(first + "");
            int next=first+second;
            first=second;
            second=next;
        }



        }
    }

