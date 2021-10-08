package Assignment;

import java.util.Scanner;

public class ProSumDiff{
    public static void main(String[] args) {
        int rem,prod=1,sum=0,result,n;
        System.out.print("Enter Number:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while(n>0)
        {
            rem = n%10;
            prod *=rem;
            sum+=rem;
            n/=10;
        }
        result = prod-sum;
        System.out.print("Difference:"+result);
    }
}
