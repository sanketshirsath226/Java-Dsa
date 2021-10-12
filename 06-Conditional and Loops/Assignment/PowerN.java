package Assignment;

import java.util.Scanner;

public class PowerN {
    public static void main(String[] args) {
      int result=1,num,pow;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter Number:");
      num = in.nextInt();
      System.out.print("Enter Power:");
      pow = in.nextInt();
      System.out.print(num+" to the power of "+pow+" : ");
      while(pow!=0)
      {
          result*=num;
          pow--;
      }
      System.out.print(result);
    }
}
