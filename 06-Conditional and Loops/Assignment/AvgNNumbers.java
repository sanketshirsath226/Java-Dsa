package Assignment;

import java.util.Scanner;

public class AvgNNumbers {
    public static void main(String[] args) {
        int n,num,sum=0,avg;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of elements:");
        n = in.nextInt();
        System.out.print("Enter the "+n+" elements respectively:");
        for(int i =0;i<n;i++)
        {
            num = in.nextInt();
            sum+=num;
        }
        avg = sum/n;
        System.out.println("Average:"+avg);
    }
}
