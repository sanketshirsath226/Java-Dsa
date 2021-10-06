//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount:");
        int p = input.nextInt();
        System.out.print("Enter Time Amount:");
        int t = input.nextInt();
        System.out.print("Enter Rate Amount:");
        int r = input.nextInt();
        int si = p*t*r/100;
        System.out.print("Simple Interest:"+si);
    }
}
