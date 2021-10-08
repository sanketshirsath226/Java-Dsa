package Assignment;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        int radius,height;
        float volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius and Height:");
        radius = in.nextInt();
        height = in.nextInt();
        volume = (float) (Math.PI*(Math.pow(radius,2))*height);
        System.out.print("Volume:"+volume);
    }
}
