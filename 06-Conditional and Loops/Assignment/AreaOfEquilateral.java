package Assignment;

import java.util.Scanner;

public class AreaOfEquilateral {
    public static void main(String[] args) {
        int side;
        float area;
        System.out.print("Enter Side of Equilateral Triangle:");
        Scanner in = new Scanner(System.in);
        side = in.nextInt();
        area = (float) ((1/4)*Math.sqrt(3)*side);
        System.out.println("Area of Equilateral Triangle:"+area);
    }
}
