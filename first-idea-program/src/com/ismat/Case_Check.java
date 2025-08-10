package com.ismat;

import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        Scanner in =new Scanner(System.in);
        String word=in.next();
        //char ch=in.next().trim().charAt(0); trim means it removes extra space
        if(word.charAt(0)> 'a' && word.charAt(0)< 'z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("Upper case");
        }



    }
}
