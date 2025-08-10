package com.ismat;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.println("enter your name: ");
        Scanner name=new Scanner(System.in);
        String Name=name.next();
        System.out.println("Good Morning dear "+Name);
    }
}
