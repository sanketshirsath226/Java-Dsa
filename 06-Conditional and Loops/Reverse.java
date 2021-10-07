// Q5 : Reverse
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        
        int rem,rev=0,num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        num = in.nextInt();
        while(num>0)
        {
            rem = num%10;
            rev = rev*10+rem;
            num /=10;
        }
        System.out.println("Reverse Number is :"+rev);
    }
}
