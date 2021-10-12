package Assignment;

import java.util.Scanner;

public class SumNegEvenOdd {
   public static void main(String[] args) {
    int sum_neg=0,sum_odd=0,sum_even=0,num;
    Scanner in = new Scanner(System.in);
    while(true)
    {
        System.out.print("Enter a Number:");
        num = in.nextInt();
        if(num<0)
        {
            sum_neg+=num;            
        }
        else if(num==0)
        {
            System.out.println("Exiting");
            break;
        }
        else if(num%2==0)
        {
            sum_even+=num;
        }
        else
        {
            sum_odd+=num;
        }
        System.out.println("Negative Sum:"+sum_neg);
        System.out.println("Positive Even:"+sum_even);
        System.out.println("Positive Odd:"+sum_odd);
        System.out.println();
    }
    in.close();
   }
   
}
