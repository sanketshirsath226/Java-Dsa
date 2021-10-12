package Assignment;

import java.util.Scanner;

public class PerfectNoCheck {
    public static void main(String[] args) {
        int perfect_check=1,num,count=2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        num = in.nextInt();
        while(count<=Math.sqrt(num))
        {
            if(num%count==0)
            {
                perfect_check+=count+(num/count);
            }
            count++;
        }
        if(num==perfect_check)
        {
            System.out.print(num+" is a Perfect Number");
        }
        else
        {
            System.out.print(num+" is a not Perfect Number");
        }
        in.close();
    }
}
