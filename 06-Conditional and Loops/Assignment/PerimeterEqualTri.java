package Assignment;

import java.util.Scanner;

public class PerimeterEqualTri {
    public static void main(String[] args) {
        int side,peri;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side of Equilateral Triangle:");
        side = in.nextInt();
        peri = 3*side;
        System.out.println("Perimeter of Equilateral Triangle:"+peri);
    }
}
