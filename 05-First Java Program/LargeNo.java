import java.util.Scanner;

public class LargeNo {
    public  static  void main(String[] args)
    {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        num1 = input.nextInt();
        System.out.print("Enter Number 2:");
        num2 = input.nextInt();
        if(num1>num2)
        {
            System.out.println(num1+" is largest number");
        }
        else if(num1<num2)
        {
            System.out.println(num2+" is largest number");
        }
        else
        {
            System.out.println(num1+" and " + num2 +" are equal");
        }
    }

}
