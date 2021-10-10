package Assignment;

import java.util.Scanner;

public class FactorNumber {
    public static void main(String[] args) {
        int factor,num,count=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        num = in.nextInt();
        System.out.println("Factors are:");
        while(count<=Math.sqrt(num))
        {
            if(num%count==0)
            {
                System.out.println(" "+count+" "+(num/count));
            }
            count++;
        }
    }
}
