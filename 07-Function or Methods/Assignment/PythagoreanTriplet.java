// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
package Assignment;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 number:");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        System.out.print(a+" "+b+" "+c+" "+isPythagoreanTriplet(a, b, c));
        in.close();
    }
    static String isPythagoreanTriplet(int a,int b,int c)
    {
        if((Math.pow(a, 2)+Math.pow(b, 2))==Math.pow(c, 2))
        {
            return " are a Pythagorean triplet.";
        }
        else
        {
            return " are not Pythagorean Triplet";
        }
    }
}
