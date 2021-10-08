package Assignment;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        int radius;
        float peri;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of Circle:");
        radius=in.nextInt();
        peri = (float) (2*3.14*radius);
        System.out.print("Perimeter is :"+peri);
    }
}
