// Calculate Discount Of Product

package Assignment;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        int price,discount,total;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Price:");
        price = in.nextInt();
        System.out.print("Enter the discount(%):");
        discount = in.nextInt();
        discount = (price*discount)/100;
        total = price - discount;
        System.out.println("Discount:"+discount);
        System.out.println("Total:"+total);
        in.close();
    }
}
