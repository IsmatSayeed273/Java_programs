package com.ismat;

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        System.out.println("enter the n : ");
        Scanner in = new Scanner(System.in);
        int rem;
        int n = in.nextInt();
        while (n > 0) {
            rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
    }
}
