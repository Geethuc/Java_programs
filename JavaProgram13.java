/*
 13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5


Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class JavaProgram13 {
    public static void main(String[] args) {
        
        double Width=5.6;
        double Height=8.5;
        double Area=Width*Height;
        double perimeter=2*(Width+Height);
        System.out.println("Area is 5.6 * 8.5 = "+Area);
        System.out.println("perimetre is 2*(5.6 + 8.5) = "+perimeter);
    }
}
