// Write a function that returns all prime numbers between two given numbers.
package Assignment;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        int n1,n2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two Numbers:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        CheckPrime(n1, n2);
        in.close();
    }
    static void CheckPrime(int n1,int n2){
        for(int i=n1;i<=n2;i++)
        {
            if(CheckPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    static boolean CheckPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        int count=2;
        while(count*count<=num)
        {
           if(num%count==0)
           {
               return false;
           }
           count++;
        }
        return count*count>num;
    }
}
