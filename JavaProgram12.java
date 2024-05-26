/*
 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class JavaProgram12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three number: ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        int average=((num1+num2+num3)/3);
        System.out.println("The average of this number is: "+average);

    }
}
