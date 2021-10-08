package Assignment;

import java.util.Scanner;

public class VolPrism {
    public static void main(String[] args) {
        int b,l,basearea,height,volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base and Length and Height:");
        b = in.nextInt();
        l = in.nextInt();
        height = in.nextInt();
        basearea = b*l;
        volume = basearea*height;
        System.out.println("Volume:"+volume);
    }
}
