package Assignment;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        int d1,d2,area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Diagonals of Rhombus=:");
        d1 = in.nextInt();
        d2 = in.nextInt();
        area = d1*d2/2;
        System.out.print("Area of Rhombus: "+area);
    }
}
