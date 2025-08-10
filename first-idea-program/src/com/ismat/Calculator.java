package com.ismat;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        System.out.println("Enter num2: ");
        int num2=input.nextInt();

        int Sum=num1+num2;
        int Sub=num1-num2;
        int Multi=num1*num2;
        float Div=num1/num2;

        System.out.println("Enter the operation u want to perfom ");

        String operation=input.next();
        if(operation.equals("sum")){
            System.out.println("the sum is "+Sum);
        }
        else if(operation.equals("sub")){
            System.out.println("the sum is "+Sub);
        } else if (operation.equals("multi")) {
            System.out.println("the sum is "+Multi);
        }
        else if(operation.equals("div")){
            if(num2!=0){
            System.out.println("the sum is "+Div);
        }
            else if(num2==0){
                System.out.println("num2 cant be zero,division invalid");
            }
        }
        else{
            System.out.println("invalid operation");
        }

    }
}
