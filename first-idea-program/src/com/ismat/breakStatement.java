package com.ismat;

import java.util.Scanner;

public class breakStatement {
    public static void main(String[] args) {
        System.out.println("enter the no n ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(i);

            if(i==5){
                break;
            }
        }
    }
}
