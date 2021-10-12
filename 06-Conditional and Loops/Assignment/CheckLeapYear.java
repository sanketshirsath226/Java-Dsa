package Assignment;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year:");
        year = in.nextInt();
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.print(year + " is a leap year");
        } else {
            System.out.print(year + " is a not leap year");
        }
        in.close();
    }
}
