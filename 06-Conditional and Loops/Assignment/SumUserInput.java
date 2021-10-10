package Assignment;

import java.util.Scanner;

public class SumUserInput {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner in =new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter number or Press 0 to exit:");
            num = in.nextInt();
            if(num==0)
            {
                System.out.println("Exiting");
                break;
            }
            else
            {
                sum+=num;
            }
            System.out.println("Sum of Number:"+sum);
        }
        System.out.println("Final Sum of Number:"+sum);
    }
}
