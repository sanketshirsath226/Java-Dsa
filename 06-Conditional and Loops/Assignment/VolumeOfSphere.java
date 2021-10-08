package Assignment;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        int radius;
        float vol;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius:");
        radius = in.nextInt();
        vol = (float)((4*Math.PI*Math.pow(radius, 3)/2));
        System.out.print("Volume of Sphere:"+vol);
    }
}
