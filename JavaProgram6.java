/*
 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

 */

import java.util.Scanner;

public class JavaProgram6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=s.nextInt();
        System.out.println("Enter the second number: ");
        int num2=s.nextInt();

        System.out.println("The addition of this two number is: "+(num1+num2));
        System.out.println("The subtract of this two number is: "+(num1-num2));
        System.out.println("The multiply of this two number is: "+(num1*num2));
        System.out.println("The division of this two number is: "+(num1/num2));
        System.out.println("The mod of this two number is: "+(num1%num2));
    }
}
