// Calculate Distance Between Two Points
package Assignment;
import java.util.Scanner;
public class Distancebtnpoints {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        float distance;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st point(x1,y1):");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.print("Enter 2nd point(x2,y2):");
        x2 = in.nextInt();
        y2 = in.nextInt();
        distance = (float) (Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
        System.out.println("Distance between two point:"+distance);
        in.close();
    }
}
