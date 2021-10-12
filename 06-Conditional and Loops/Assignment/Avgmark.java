package Assignment;

import java.util.Scanner;

public class Avgmark {
    public static void main(String[] args) {
        int n,marks,sum=0;
        int avg;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter No of Subjects:");
        n = in.nextInt();
        System.out.print("Enter marks of subject:");
        for(int i=0;i<n;i++)
        {
            marks = in.nextInt();
            sum+=marks;
        }
        avg = sum/n;
        System.out.print("Average:"+avg);
        in.close();
    }
}
