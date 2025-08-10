package com.ismat;

import java.util.Scanner;

public class Count_repeatNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = in.nextInt();
        System.out.println("enter the no u want to count : ");
        int m=in.nextInt();
        System.out.println(n);
        int rem;int count =0;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            if(rem==m){
                count++;
            }
        }
        System.out.println("The no " +m+ " is repeated "+ count+ " times");

    }
}
