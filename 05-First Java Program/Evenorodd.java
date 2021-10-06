//1.Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class Evenorodd {
    public  static  void main(String[] args)
    {
        System.out.print("Enter a Number:");
        int num = (new Scanner(System.in)).nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is a Even Number");
        }
        else
        {
            System.out.println(num+" is a odd Number");
        }
    }
}
