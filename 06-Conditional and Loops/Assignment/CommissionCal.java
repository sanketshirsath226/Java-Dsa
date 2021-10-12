package Assignment;

import java.util.Scanner;

public class CommissionCal {
    public static void main(String[] args) {
        int total,c_sale,t_sale;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Total Sale Val:");
        total = in.nextInt();
        System.out.print("Enter Commission Sale in %:");
        c_sale = in.nextInt();
        t_sale = total*c_sale/100;
        System.out.println("Comission is:"+t_sale);
        in.close();
    }
}
