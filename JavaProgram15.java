/*
15. Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class JavaProgram15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number is: ");
        int num1=s.nextInt();
        System.out.println("Enter second number is: ");
        int num2=s.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("The first number num1 is: "+ num1 + "The second  number num2 is: "+ num2);
    }
}
