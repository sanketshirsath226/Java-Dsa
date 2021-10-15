package Assignment;
import java.util.Scanner;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class MinandMax {
public static void main(String[] args) {
        int num1,num2,num3;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
        System.out.println("Maximum Number:"+isMax(num1, num2, num3));
        System.out.println("Minimum Number:"+isMin(num1, num2, num3));
        in.close();
    }
    static int isMax(int num1,int num2,int num3)
    {
        if(num1>num2 && num1>num3)
        {
            return num1;
        }
        else if(num2>num1 && num2>num3)
        {
            return num2;
        }   
        else
        {
            return num3;
        }   
    }
    static int isMin(int num1,int num2,int num3)
    {
        if(num1<num2 && num1<num3)
        {
            return num1;
        }
        else if(num2<num1 && num2<num3)
        {
            return num2;
        }   
        else
        {
            return num3;
        }   
    }
}
