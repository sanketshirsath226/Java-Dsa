/*
9. Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- <br/>

4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
*/

package Assignment;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n:");
        n = in.nextInt();
        System.out.println("Factorial:"+factorial(n));
        in.close();
    }
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*(factorial(n-1));
        }
    }
}
