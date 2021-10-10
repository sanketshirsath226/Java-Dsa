package Assignment;

import java.util.Scanner;

public class LargestUserInput {
    public static void main(String[] args) {
        int num,largest=0;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter Number or Press 0 to exit:");
            num=in.nextInt();
            if(num==0)
            {
                System.out.println("Exiting");
                break;
            }
            else
            {
                if(num>largest)
                {
                    largest=num;
                } 
            }
            System.out.println("Largest Number:"+largest);
        }
        System.out.println("Final Largest Number:"+largest);
    }
}
