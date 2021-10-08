package Assignment;

import java.util.Scanner;

public class TSACube {
    public static void main(String[] args) {
        int side,tsarea;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of cube");
        side= in.nextInt();
        tsarea = (int)(6*Math.pow(side, 2));
        System.out.println("Total Surface Area:"+tsarea);
    }
}
