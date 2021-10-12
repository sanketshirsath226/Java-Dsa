package Assignment;

import java.util.Scanner;

public class BatAvg {
    public static void main(String[] args) {
        int run,out,avg;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Run's of Batsman:");
        run = in.nextInt();
        System.out.print("Enter no of Batsman Out:");
        out=in.nextInt();
        avg=run/out;
        System.out.print("Average of Batsman:"+avg);
        in.close();
    }
}
