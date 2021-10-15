// Write a function to find if a number is a palindrome or not. Take number as parameter.
package Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        num=in.nextInt();
        System.out.print(num+isPalindrome(num));
        in.close();
    }
    static String isPalindrome(int num)
    {
        int original=num,rev=0;
        while(num>0)
        {
            rev=rev*10+(num%10);
            num/=10;
        }
        if(rev==original)
        {
            return " is Pallindrome";
        }
        else
        {
            return " is not Pallindrome";
        }
    }
}
