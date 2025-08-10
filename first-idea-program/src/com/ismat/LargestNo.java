package com.ismat;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        System.out.println("enter a: ");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        System.out.println("enter b: ");
        int q = input.nextInt();
        System.out.println("enter c: ");
        int r = input.nextInt();

        if (p > q && p > r) {
            System.out.println(p + " is the largest");
        } else if (q > p && q > r) {
            System.out.println(q + " is the largest");
        } else {
            System.out.println(r + "is the largest");
        }
    }
}
