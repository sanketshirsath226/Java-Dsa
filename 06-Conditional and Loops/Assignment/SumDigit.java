// Sum Of A Digits Of Number

package Assignment;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        int num, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number:");
        num=in.nextInt();
        while(num>0)
        {
            sum+=(num%10);
            num/=10;
        }
        System.out.print("Sum of Digit:"+sum);
        in.close();
    }
}
