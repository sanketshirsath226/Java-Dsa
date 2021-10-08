package Assignment;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        int side,peri;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side of Square:");
        side = in.nextInt();
        peri = 4*side;
        System.out.print("Perimeter is :"+peri);
    }
}
