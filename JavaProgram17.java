/*
17.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
 */

import java.util.Scanner;

public class JavaProgram17{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input the first number : ");
        int num1=s.nextInt();
        System.out.println("Input the second number : ");
        int num2=s.nextInt();
        System.out.println("Input the third number : ");
        int num3=s.nextInt();
        int sum=num1+num2;
        if(sum==num3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
