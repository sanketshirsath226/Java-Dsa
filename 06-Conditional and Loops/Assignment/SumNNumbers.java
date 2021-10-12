package Assignment;

import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {
        int n,sum=0,num;
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements:");
        n = in.nextInt();
        System.out.print("Enter "+n+" numbers:");
        for(int i=0;i<n;i++)
        {
            num = in.nextInt();
            sum +=num;
        }
        System.out.println("Sum:"+sum);
    }
}
