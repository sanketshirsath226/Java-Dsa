package Assignment;
import java.util.Scanner;

public class ElectricityBill {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the amount of kwh used: ");
    double kwh = in.nextDouble();
    System.out.print("Enter the cost of the kwh: ");
    double cost = in.nextDouble();
    System.out.print("Enter the number of days used: ");
    int days = in.nextInt();
    double bill = 0;
    if(kwh > 0 && cost > 0 && days > 0){
        bill = kwh * cost;
        bill = bill / days;
        System.out.println("The bill is: " + bill);
    }
    else{
        System.out.println("Invalid input");
    }
    in.close();
   } 
}
