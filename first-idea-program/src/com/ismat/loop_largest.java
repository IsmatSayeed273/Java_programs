package com.ismat;

import java.util.Scanner;

public class loop_largest {
    public static void main(String[] args) {
        System.out.println("enter the vakues of a, b,c :");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

//        int MAX=a;
//        if(b>MAX){
//            MAX=b;
//        }
//        else if (c>MAX){
//            MAX=c;
//        }
//        int MAX=0;
//
//        if(b>a){
//            MAX=b;
//        }else{
//            MAX=a;
//            }
//        if(c>MAX){
//            MAX=c;
//        }
        int MAX= Math.max(c,(Math.max(a,b)));
        System.out.println("largest no is"+ MAX);
    }
}
