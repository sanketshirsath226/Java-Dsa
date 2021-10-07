// Q4 : Counting occurrences
import java.util.Scanner;

public class Occ_Num {
    public static void main(String[] args) {
        
        int rem,num,occ,count=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        num = in.nextInt();
        System.out.print("Number to Count?:");
        occ = in.nextInt();
        while(num>0)
        {
            rem = num%10;
            if(rem==occ)
            {
                count++;
            }
            num/=10;
        }
        System.out.println("Number of Occurance of "+occ+" is "+count);
    }
}
