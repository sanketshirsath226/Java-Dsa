// Define a program to find out whether a given number is even or odd.

package Assignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        num=in.nextInt();
        if(isEvenOdd(num))
        {
            System.out.print(num+" is Even Number");
        }
        else
        {
            System.out.print(num+" is Odd Number");
        }
        in.close();
    }
    static boolean isEvenOdd(int num)
    {
        return num%2==0;
    }
}
