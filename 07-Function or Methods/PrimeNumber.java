import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        num = in.nextInt();
        System.out.print("Prime:"+CheckPrime(num));
        in.close();
    }
    static boolean CheckPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        int count=2;
        while(count*count<=num)
        {
           if(num%count==0)
           {
               return false;
           }
           count++;
        }
        return count*count>num;
    }
}
