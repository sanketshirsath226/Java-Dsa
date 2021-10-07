// Calculator program

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int num1,num2,result;
        char ch;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter the operator or Press x to exit:");
            ch = in.next().trim().charAt(0);
            if( ch=='+' ||  ch=='-' ||  ch=='/' ||  ch=='*'||  ch=='%')
            {
                System.out.print("Enter Two Number:");
                num1 = in.nextInt();
                num2 = in.nextInt();
                if(ch=='+')
                {
                    result = num1 + num2;
                }
                else if(ch=='-')
                {
                    result = num1 - num2;

                }
                else if(ch=='*')
                {
                    result = num1 * num2;

                }
                else if(ch=='/')
                {
                    result = num1 / num2;

                }
                else
                {
                    result = num1 % num2;
                }
                System.out.println("Result:"+result);
            }
            else if(ch =='X' || ch=='x')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Operation");
            }
        }
    }
}
