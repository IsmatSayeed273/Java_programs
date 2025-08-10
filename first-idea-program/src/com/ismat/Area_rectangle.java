package com.ismat;
import java.util.Scanner;
public class Area_rectangle {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input length and width
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            // Calculate area
            double area = length * width;

            // Display the result
            System.out.println("The area of the rectangle is: " + area);
        }
    }


