// Write a function that returns the sum of first n natural numbers.
package Assignment;

import java.util.Scanner;

public class SumNNo {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n:");
        n = in.nextInt();
        System.out.print("Sum:"+(getSum(n)));
        in.close();
    }
    static int getSum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
