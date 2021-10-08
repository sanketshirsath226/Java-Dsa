package Assignment;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        int b,h,area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base and Height of Parallelogram:");
        b = in.nextInt();
        h = in.nextInt();
        area = b*h;
        System.out.println("Area: "+area);
    }
}
