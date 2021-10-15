// Define a method that returns the product of two numbers entered by user.
package Assignment;

import java.util.Scanner;
public class ProdTwoNum {
    public static void main(String[] args) {
        int num1,num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two Numbers:");
        num1=in.nextInt();
        num2=in.nextInt();
        System.out.print("Product:"+CheckProd(num1, num2));
        in.close();
    }

    static int CheckProd(int num1,int num2) {
        return num1*num2; 
    }
}
