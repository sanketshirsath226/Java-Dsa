// Q3 : Fibonacci numbers
import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        int no1,no2,n,count;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter No1:");
        no1 = in.nextInt();
        System.out.print("Enter No2:");
        no2 = in.nextInt();
        System.out.print("Enter N:");
        n = in.nextInt();
        count=2;
        while(count<=n)
        {
            int temp = no2;
            no2 +=no1;
            no1 = temp;
            count++;
        }
        System.out.println(""+no2);
    }
}
