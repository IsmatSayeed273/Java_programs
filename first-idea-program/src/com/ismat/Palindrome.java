package com.ismat;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the word ");
        Scanner input=new Scanner(System.in);
        String originalWord=input.next();
        int length= originalWord.length();
        String reversedWord= "";
        for( int i=length-1; i>=0; i-- ){
            reversedWord=reversedWord + originalWord.charAt(i);

        }
        if(reversedWord.equals(originalWord)){
            System.out.println("The word "+ originalWord+ " is palindrome");
        }
        else {
            System.out.println("The word " + originalWord + " is not palindrome");
        }
    }
}
