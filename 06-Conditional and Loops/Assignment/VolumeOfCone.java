package Assignment;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        int radius,height;
        float volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius and Height of Cone:");
        radius = in.nextInt();
        height = in.nextInt();
        volume = (float) ((3.14*Math.pow(radius, 2)*height)/3);
        System.out.println("Volume of Cone:"+volume);
    }
}
