package Assignment;

import java.util.Scanner;

public class CiCal {
    public static void main(String[] args) {
        int p,r,n;
        double ci;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal, Rate, No of year?(respectively):");
        p = in.nextInt();
        r = in.nextInt();
        n = in.nextInt();
        ci = p*(Math.pow((1+r/100),n))-p;
        System.out.printf("Compound Interest:"+"%.2f",ci);
        in.close();
    }
}
