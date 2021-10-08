package Assignment;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        int num1,num2,temp,count=2,n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num1,Num2 and Count Value:");
        num1 = in.nextInt();
        num2 = in.nextInt();
        n = in.nextInt();
        num1 = 0;
        num2 = 1;
        n = 6;
        System.out.print("Fibonacci Series:"+num1+" "+num2+" ");
        while(count<n)
        {
            temp = num2;
            num2 = num1 + num2;
            num1 = temp;
            count++;
            System.out.print(num2+" ");
        }
    }
}
