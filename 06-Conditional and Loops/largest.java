//Q1 : Largest number
package com.conditional_loops;

import java.util.Scanner;

public class Largest {
    public static void main(String args[])
    {
        int num1,num2,num3,max;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        num1 = input.nextInt();
        System.out.print("Enter Number 2:");
        num2 = input.nextInt();
        System.out.print("Enter Number 3:");
        num3 = input.nextInt();

        /* Approach - 1
        max = num1;
        if(num2>max)
        {
            max = num2;
        }
        if(num3>max)
        {
            max = num3;
        }
        System.out.println("Largest Number is : "+ max);
        */

        /*
        Approach -2
        max = Math.max(num3,Math.max(num1,num2));
        System.out.println("Largest Number is : "+max);
        */
    }

}
