package Assignment;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int l,b;
        float area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Length and Breadth:");
        l = in.nextInt();
        b = in.nextInt();
        area = l*b;
        System.out.println("Area of Rectangle with :"+l+" and " +b+" : "+area);
    }
}
