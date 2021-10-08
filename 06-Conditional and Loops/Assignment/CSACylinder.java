package Assignment;

import java.util.Scanner;

public class CSACylinder {
    public static void main(String[] args) {
        int height,radius;
        float volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Height and Radius Respectively:");
        height = in.nextInt();
        radius = in.nextInt();
        volume = (float) (2*Math.PI*radius*height);
        System.out.print("Volume:"+volume);
    }
}
