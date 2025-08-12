package com.ismat;

import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fruit name : ");
        String fruit = input.next();

        if(fruit.equals("mango")){
            System.out.println("The king of fruits.");
        }
        else {
            System.out.println("Okay this is a sweet fruit");
        }


    }
}
