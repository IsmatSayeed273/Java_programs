package com.ismat;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner name=new Scanner(System.in);
        String Name=name.next();
        System.out.println("Good Night "+Name);
        System.out.println("Thank you: ");
    }
}
