package com.ismat;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("enter num: ");
        Scanner input =new Scanner(System.in);
        int number= input.nextInt();
        int originalNumber = number;
        int sum=0;
        while(number>0){
            int digit=number%10;
             sum= sum+(digit*digit*digit);
             number=number/10;
        }
        if(originalNumber==sum){
            System.out.println("its an armstrong no");
        }
        else {
            System.out.println("not an armstrong no");
        }
    }
}
