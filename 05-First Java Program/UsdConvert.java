//Input currency in rupees and output in USD.

import java.util.Scanner;

public class UsdConvert {
    public  static  void main(String[] args)
    {
        int amount;
        System.out.print("Enter currency in INR:");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        System.out.println("Amount in USD:"+(amount/74.85));
    }
}
