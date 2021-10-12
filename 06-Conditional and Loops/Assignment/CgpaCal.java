package Assignment;

import java.util.Scanner;

public class CgpaCal {
    public static void main(String[] args) {
        int total_marks;
        double cgpa;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks in 600:");
        total_marks = in.nextInt();
        cgpa=((total_marks*100)/600)/9.5;
        System.out.printf("CGPA : "+"%.2f",cgpa);
        in.close();
    }
}
