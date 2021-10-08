package Assignment;

import java.util.Scanner;


public class PerimeterOfParlogram {
    public static void main(String[] args) {
        int base,side,peri;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base and Side of Parallelogram:");
        base = in.nextInt();
        side = in.nextInt();
        peri = 2*(base+side);
        System.out.println("Perimeter of Parallelogram:"+peri);
    }
}
