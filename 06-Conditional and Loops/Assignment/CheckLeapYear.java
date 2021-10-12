package Assignment;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year,flag=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year:");
        year=in.nextInt();
        if(year%400!=0)
        {
            if(year%100!=0)
            {
                if(year%4==0)
                {
                    flag = 1;
                }
            }
        }
        else
        {
            flag = 1;
        }
        if(flag==1)
        {
            System.out.print(year + " is a leap year");
        }
        else
        {
            System.out.print(year + " is a not leap year");
        }
        in.close();
    }
}
