package Assignment;

import java.util.Scanner;

public class VolumeOfPyramid {
        public static void main(String[] args) {
            int length,width,height;
            float volume;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Length, Width and Height respectively:");
            length = in.nextInt();
            width = in.nextInt();
            height = in.nextInt();
            volume = (length*width*height)/3;
            System.out.println("Volume:"+volume);
        }
}
