// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package Assignment;

import java.util.Scanner;

public class CircumAreaCircle {
    public static void main(String[] args) {
        int radius;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        radius=in.nextInt();
        System.out.printf("Circumference:"+"%.2f\n",CheckCircumference(radius));
        System.out.printf("Area:"+"%.2f",CheckArea(radius));
        in.close();
    }
    static double CheckCircumference(int radius)
    {
        return (2*Math.PI*radius);
    }
    static double CheckArea(int radius)
    {
        return (Math.PI*Math.pow(radius, 2));
    }
}
