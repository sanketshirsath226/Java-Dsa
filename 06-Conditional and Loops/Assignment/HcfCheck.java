package Assignment;

import java.util.Scanner;

public class HcfCheck {
    public static void main(String[] args) {
        int num1,num2,temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num1:");
        num1 = in.nextInt();
        System.out.print("Enter Num2:");
        num2=in.nextInt();
        while(num2!=0)
        {
            temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        System.out.print("HCF:"+num1);
        in.close();
    }
}