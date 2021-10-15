// Write a program to print the sum of two numbers entered by user by defining your own method.
package Assignment;

import java.util.Scanner;

public class SumofTwoNo {
    public static void main(String[] args) {
        int num1,num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two Numbers:");
        num1=in.nextInt();
        num2=in.nextInt();
        System.out.print("Sum:"+CheckSum(num1, num2));
        in.close();
    }

    static int CheckSum(int num1,int num2) {
        return num1+num2; 
    }
}
