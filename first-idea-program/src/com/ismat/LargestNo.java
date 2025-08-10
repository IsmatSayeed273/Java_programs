package com.ismat;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        System.out.println("enter a: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("enter b: ");
        int b = input.nextInt();
        System.out.println("enter c: ");
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + "is the largest");
        }
    }
}
