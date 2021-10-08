// Area Of Triangle
package Assignment;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        int h,b;
        float area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base and Height:");
        h = in.nextInt();
        b = in.nextInt();
        area = h*b/2;
        System.out.println("Area of Traingle with :"+b+" and " +h+" : "+area);
    }
}
