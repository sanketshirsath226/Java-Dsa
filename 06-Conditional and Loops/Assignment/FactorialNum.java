package Assignment;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        int fact=1,num,count=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        num = in.nextInt();
        while(count<=num)
        {
            fact=fact*count;
            count++;
        }
        System.out.println("Factorial of "+num+" is:"+fact);
    }
}
