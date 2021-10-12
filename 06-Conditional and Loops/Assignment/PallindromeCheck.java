package Assignment;

import java.util.Scanner;

public class PallindromeCheck {
    public static void main(String[] args) {
        int number,rev=0,temp_num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        number = in.nextInt();
        temp_num = number;
        while(temp_num>0)
        {
            rev =rev*10+(temp_num%10);
            temp_num/=10;
        }
        if(temp_num==rev)
        {
            System.out.println(number+" is a Pallindrome");
        }
        else
        {
            System.out.println(number+" is not Pallindrome");
        }
        in.close();
    }
}
