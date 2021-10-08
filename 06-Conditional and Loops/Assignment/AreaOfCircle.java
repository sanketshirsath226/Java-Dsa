// Area Of Circle Java Program
package Assignment;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int radius;
        float area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius:");
        radius = in.nextInt();
        area = (float) ((3.14) * (Math.pow(radius, 2)));
        System.out.println("Area of circle with "+radius+" : "+area);
    }
}
