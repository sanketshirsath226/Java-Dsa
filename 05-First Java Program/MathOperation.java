//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class MathOperation {
    public  static  void main(String[] args)
    {
        int num1,num2,result=0;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        num1 = input.nextInt();
        System.out.print("Enter Number 2:");
        num2 = input.nextInt();
        System.out.print("Enter Operator(+,-,/,*):");
        operator = input.next().charAt(0);
        if(operator=='+')
        {
            result = num1+num2;
        }
        else if(operator=='-')
        {
            result = num1-num2;
        }
        else if(operator=='*')
        {
            result = num1*num2;
        }
        else if(operator=='/')
        {
            result = num1/num2;
        }
        else
        {
            System.out.print("Invalid Operator Entered");
        }
        System.out.println("Result:"+result);
    }
}
