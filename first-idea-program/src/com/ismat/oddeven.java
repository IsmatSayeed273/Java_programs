package com.ismat;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("enter the no : ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();

        if(num>0){
            System.out.println("positive");
        }
        else if(num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
